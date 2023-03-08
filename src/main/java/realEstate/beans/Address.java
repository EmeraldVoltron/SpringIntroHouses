/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Mar 2, 2023
 */
package realEstate.beans;

import jakarta.persistence.Embeddable;

/**
 * @author abbyb
 *
 */
@Embeddable
public class Address {
	private String street;
	private String city;
	private String state;
	
	public Address() {
		super();
	}
	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
