package bookinggui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DataFile {
	// variable declaration
	private String title;
	private String customerFirstName;
	private String customerLastName;
	private String custromerEmailId;
	private Long customerPhoneNumber;
	private double customerDriverLicenseNumber;
	private String expiryDate;
	private String customerPassportNumber;
	private String customerCountry;

	// Parameterized constructor
	public DataFile(String title, String firstName, String lastName, String email, Long phoneNumber) {
		this.title = title;
		this.customerFirstName = firstName;
		this.customerLastName = lastName;
		this.custromerEmailId = email;
		this.customerPhoneNumber = phoneNumber;

	}

	// dataFileCreate() method to create a customerDetails.csv file and write data
	// into it.
	public void dataFileCreate() {
		String COMMA_DELIMITER = ",";
		String NEW_LINE_SEPERATOR = "\n";
		String FILE_HEADER = "Title,First Name,Last Name,Email,Phone Number";
		try {
			List<Customer> dataList = new ArrayList<Customer>();
			dataList.add(
					new Customer(title, customerFirstName, customerLastName, custromerEmailId, customerPhoneNumber));

			FileWriter fileWriter = new FileWriter("CustomerDetails.csv");
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.append(FILE_HEADER);

			for (Customer c : dataList) {
				bufferWriter.write(NEW_LINE_SEPERATOR);
				bufferWriter.write(c.getTitle());
				bufferWriter.write(COMMA_DELIMITER);
				bufferWriter.write(c.getFirstName());
				bufferWriter.write(COMMA_DELIMITER);
				bufferWriter.write(c.getLastName());
				bufferWriter.write(COMMA_DELIMITER);
				bufferWriter.write(c.getEmailAddress());
				bufferWriter.write(COMMA_DELIMITER);
				bufferWriter.write(String.valueOf(c.getPhone()));
				bufferWriter.write(COMMA_DELIMITER);
			}

			bufferWriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
