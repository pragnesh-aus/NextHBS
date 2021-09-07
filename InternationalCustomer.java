package bookinggui;

import java.util.Date;

public class InternationalCustomer extends Customer {
	String passportNumber;
	String country;
	Date expiryDate;

	public InternationalCustomer() {
	}

	public InternationalCustomer(String title, String firstName, String lastName, String emailAddress, long phone,
			String passportNumber, String country, Date expiryDate) {
		super(title, firstName, lastName, emailAddress, phone);
		this.passportNumber = passportNumber;
		this.country = country;
		this.expiryDate = expiryDate;
	}

	// Copy Constructor
	public InternationalCustomer(InternationalCustomer i) {
		super(i.title, i.firstName, i.lastName, i.emailAddress, i.phone);
		passportNumber = i.passportNumber;
		country = i.country;
		expiryDate = i.expiryDate;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "InternationalCustomer [passportNumber=" + passportNumber + ", country=" + country + ", expiryDate="
				+ expiryDate + ", International Customer Details= " + super.toString() + "]";
	}

}
