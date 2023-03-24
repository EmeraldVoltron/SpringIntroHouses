/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Mar 2, 2023
 */
package realEstate.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import realEstate.beans.House;
/**
 * @author abbyb
 *
 */
//@Repository
public interface HouseRepository extends JpaRepository<House, Long> {
	
}