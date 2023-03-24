/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Mar 2, 2023
 */
package realEstate.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author abbyb
 *
 */
@Entity
@Data
@NoArgsConstructor
public class House {
	@Id
	@GeneratedValue
	private int id;
	private int numOfBeds;
	private double numOfBaths;
	private String sellerCompanyName;
	@Autowired
	private Address address;
	
	
	public House(String sellerCompanyName) {
		super();
		this.sellerCompanyName = sellerCompanyName;
	}
	
	public House(String sellerCompanyName, int numOfBeds, double numOfBaths) {
		super();
		this.sellerCompanyName = sellerCompanyName;
		this.numOfBaths = numOfBaths;
		this.numOfBeds = numOfBeds;
	}
	
	public House(int id, int numOfBeds, double numOfBaths, String sellerCompanyName) {
		super();
		this.id = id;
		this.sellerCompanyName = sellerCompanyName;
		this.numOfBaths = numOfBaths;
		this.numOfBeds = numOfBeds;
	}

//	@Override
//	public String toString() {
//		return "House [id=" + id + ", numOfBeds=" + numOfBeds + ", numOfBaths=" + numOfBaths + ", sellerCompanyName="
//				+ sellerCompanyName + "]";
//	}


	@Override
	public String toString() {
		return "House [id=" + id + ", numOfBeds=" + numOfBeds + ", numOfBaths=" + numOfBaths + ", sellerCompanyName="
				+ sellerCompanyName + ", address=" + address + "]";
	}

	
	
	
	
	
}
