package bookinggui;

import java.util.Date;

public class DomesticCustomer extends Customer {
	int driverLicenseNumber;
	Date expiryDate;

	// Default Constructor
	public DomesticCustomer() {

	}

	// Parameterized Constructor
	public DomesticCustomer(String title, String firstName, String lastName, String emailAddress, long phone,
			int driverLicenseNumber, Date expiryDate) {
		super(title, firstName, lastName, emailAddress, phone);
		this.driverLicenseNumber = driverLicenseNumber;
		this.expiryDate = expiryDate;
	}

	// Copy Constructor
	public DomesticCustomer(DomesticCustomer d) {
		super(d.title, d.firstName, d.lastName, d.emailAddress, d.phone);
		driverLicenseNumber = d.driverLicenseNumber;
		expiryDate = d.expiryDate;
	}

	public int getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public void setDriverLicenseNumber(int driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "DomesticCustomer [driverLicenseNumber=" + driverLicenseNumber + ", expiryDate=" + expiryDate
				+ ", Customer Details= " + super.toString() + " ]";
	}

}
