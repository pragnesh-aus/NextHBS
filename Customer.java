package bookinggui;

public class Customer {
	protected String title;
	protected String firstName;
	protected String lastName;
	protected String emailAddress;
	protected long phone;

	// Default Constructor
	public Customer() {

	}

	// Parameterized constructor of customer class
	public Customer(String title, String firstName, String lastName, String emailAddress, long phone) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", phone=" + phone + "]";
	}

	
    //accessor , mutator methods of customer class
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
