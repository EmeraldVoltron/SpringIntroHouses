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

/**
 * @author abbyb
 *
 */
@Entity
public class House {
	@Id
	@GeneratedValue
	private int id;
	private int numOfBeds;
	private double numOfBaths;
	private String sellerCompanyName;
	@Autowired
	private Address address;
	
	public House() {
		super();
		this.numOfBaths = 3;
	}
	
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

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the numOfBeds
	 */
	public int getNumOfBeds() {
		return numOfBeds;
	}

	/**
	 * @param numOfBeds the numOfBeds to set
	 */
	public void setNumOfBeds(int numOfBeds) {
		this.numOfBeds = numOfBeds;
	}

	/**
	 * @return the numOfBaths
	 */
	public double getNumOfBaths() {
		return numOfBaths;
	}

	/**
	 * @param numOfBaths the numOfBaths to set
	 */
	public void setNumOfBaths(double numOfBaths) {
		this.numOfBaths = numOfBaths;
	}

	/**
	 * @return the sellerCompanyName
	 */
	public String getSellerCompanyName() {
		return sellerCompanyName;
	}

	/**
	 * @param sellerCompanyName the sellerCompanyName to set
	 */
	public void setSellerCompanyName(String sellerCompanyName) {
		this.sellerCompanyName = sellerCompanyName;
	}

//	@Override
//	public String toString() {
//		return "House [id=" + id + ", numOfBeds=" + numOfBeds + ", numOfBaths=" + numOfBaths + ", sellerCompanyName="
//				+ sellerCompanyName + "]";
//	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", numOfBeds=" + numOfBeds + ", numOfBaths=" + numOfBaths + ", sellerCompanyName="
				+ sellerCompanyName + ", address=" + address + "]";
	}

	
	
	
	
	
}
