/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Mar 2, 2023
 */
package realEstate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import realEstate.beans.Address;
import realEstate.beans.House;

/**
 * @author abbyb
 *
 */
@Configuration
public class BeanConfiguration {

    //@Autowired
    @Bean
    House house() {
        House bean = new House("Abby Boggs");
//		bean.setSellerCompanyName("Abby");
//		bean.setNumOfBaths(2.5);
//		bean.setNumOfBeds(4);
        return bean;
    }

    //@Autowired
    @Bean
    Address address() {
        Address bean = new Address("123 Main Street", "Des Moines", "IA");
        return bean;
    }
	
}
