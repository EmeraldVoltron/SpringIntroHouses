/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Mar 9, 2023
 */
package realEstate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import realEstate.beans.House;
import realEstate.repository.HouseRepository;

/**
 * @author abbyb
 *
 */
@Controller
public class WebController {
	@Autowired(required = false)
	HouseRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllHouses(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewHouse(model);
		}
		model.addAttribute("house", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputHouse")
	public String addNewHouse(Model model) {
		House c = new House();
		model.addAttribute("newHouse", c);
		return "input";
	}
	
	@PostMapping("/inputHouse")
	public String addNewHouse(@ModelAttribute House c, Model model) {
		repo.save(c);
		return viewAllHouses(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateHouse(@PathVariable("id") long id, Model model) {
		House h = repo.findById(id).orElse(null);
		model.addAttribute("newHouse", h);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseHouse(House h, Model model) {
		repo.save(h);
		return viewAllHouses(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		House h = repo.findById(id).orElse(null);
		repo.delete(h);
		return viewAllHouses(model);
	}
}
