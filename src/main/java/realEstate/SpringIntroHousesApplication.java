package realEstate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import realEstate.beans.Address;
import realEstate.beans.House;
import realEstate.controller.BeanConfiguration;
import realEstate.controller.WebController;



@SpringBootApplication
public class SpringIntroHousesApplication  /* implements CommandLineRunner */ {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIntroHousesApplication.class, args);
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House h = appContext.getBean("house", House.class);
		
		System.out.println(h.toString());
		((AbstractApplicationContext) appContext).close();
		
	}

//	@Autowired(required=false)
//	realEstate.repository.HouseRepository repo;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		House h = appContext.getBean("house", House.class);
//		h.setSellerCompanyName("HLM Properties");
//		repo.save(h);
//		
//		House h2 = new House("Abby Boggs", 4, 3.5);
//		Address a = new Address("123 Main Street", "Des Moines", "IA");
//		h2.setAddress(a);
//		
//		List<House> allMyHouses = repo.findAll();
//		for(House houses : allMyHouses) {
//			System.out.println(houses.toString());
//		}
//		
//		((AbstractApplicationContext) appContext).close();
//	}
	

}
