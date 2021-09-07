package bookinggui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.color.CMMException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

public class BookingGUI {

	private JFrame frame;
	private JTextField txtTitle;
	private JTextField txtFirstName;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingGUI window = new BookingGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookingGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(25, 27, 43, 14);
		frame.getContentPane().add(lblTitle);

		txtTitle = new JTextField();
		txtTitle.setBounds(133, 24, 103, 20);
		frame.getContentPane().add(txtTitle);
		txtTitle.setColumns(10);

		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(25, 55, 64, 14);
		frame.getContentPane().add(lblNewLabel);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(133, 52, 103, 20);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(25, 92, 62, 14);
		frame.getContentPane().add(lblLastName);

		textField_2 = new JTextField();
		textField_2.setBounds(133, 89, 103, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setBounds(25, 129, 75, 14);
		frame.getContentPane().add(lblEmailAddress);

		textField_3 = new JTextField();
		textField_3.setBounds(133, 126, 103, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(25, 167, 75, 14);
		frame.getContentPane().add(lblPhoneNumber);

		textField_4 = new JTextField();
		textField_4.setBounds(133, 164, 103, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Select", "Superior_Queen", "Break_Queen", "Deluxe_King", "Deluxe_Twin" }));
		comboBox.setBounds(133, 200, 103, 20);
		frame.getContentPane().add(comboBox);

		JLabel lblRoomType = new JLabel("Room Type");
		lblRoomType.setBounds(25, 203, 67, 14);
		frame.getContentPane().add(lblRoomType);

		JLabel lblNoOfGuests = new JLabel("No. of Guests");
		lblNoOfGuests.setBounds(25, 239, 75, 14);
		frame.getContentPane().add(lblNoOfGuests);

		textField_5 = new JTextField();
		textField_5.setBounds(133, 236, 103, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel lblCheckIn = new JLabel("Check In");
		lblCheckIn.setBounds(25, 274, 75, 14);
		frame.getContentPane().add(lblCheckIn);

		textField_6 = new JTextField();
		textField_6.setBounds(132, 271, 104, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel lblCheckOutDate = new JLabel("Check Out");
		lblCheckOutDate.setBounds(25, 309, 75, 14);
		frame.getContentPane().add(lblCheckOutDate);

		textField_7 = new JTextField();
		textField_7.setBounds(133, 306, 103, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		JRadioButton rdbtnDomesticCustomer = new JRadioButton("Domestic Customer");
		rdbtnDomesticCustomer.setBounds(253, 23, 164, 23);
		frame.getContentPane().add(rdbtnDomesticCustomer);

		JRadioButton rdbtnInternationalCustomer = new JRadioButton("International Customer");
		rdbtnInternationalCustomer.setBounds(520, 23, 164, 23);
		frame.getContentPane().add(rdbtnInternationalCustomer);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(253, 258, 500, 165);
		frame.getContentPane().add(textArea);

		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSaveActionPerformed(e);
			}

			// Save button
			private void btnSaveActionPerformed(ActionEvent e) {
				Long phoneNumber = Long.parseLong(textField_4.getText());
				String roomType = comboBox.getSelectedItem().toString();
				// Create a object of Customer class to get value from textbox.
				Customer customerObject = new Customer(txtTitle.getText(), txtFirstName.getText(),
						textField_2.getText(), textField_3.getText(), phoneNumber);

				customerObject.setTitle(txtTitle.getText());
				customerObject.setFirstName(txtFirstName.getText());
				customerObject.setLastName(textField_2.getText());
				customerObject.setEmailAddress(textField_3.getText());
				customerObject.setPhone(Long.parseLong(textField_4.getText()));
				SimpleDateFormat dateObject = new SimpleDateFormat("dd-mm-yyyy");
				Booking bookingObject = new Booking();
				try {
					bookingObject.setCheckIn(dateObject.parse(textField_6.getText()));
					bookingObject.setCheckOut(dateObject.parse(textField_7.getText()));
				} catch (ParseException exe) {
					Logger.getLogger(BookingGUI.class.getName()).log(Level.SEVERE, null, exe);
				}
				bookingObject.setNumberOfGuests(Integer.parseInt(textField_5.getText()));

				DataFile dataObj = new DataFile(txtTitle.getText(), txtFirstName.getText(), textField_2.getText(),
						textField_3.getText(), Long.parseLong(textField_4.getText()));
				dataObj.dataFileCreate();
				rdbtnDomesticCustomer.setActionCommand("Domestic Customer");
				rdbtnInternationalCustomer.setActionCommand("International Customer");

				textArea.append("Hello " + txtFirstName.getText() + " Thank you for using NEXT HBS \n");
				textArea.append("Your booking as shown below is confirmed.\n");
				textArea.append(txtTitle.getText() + " " + txtFirstName.getText() + " "
						+ textField_2.getText() + ", " + textField_3.getText() + ",  "
						+ Long.parseLong(textField_4.getText()) + ", ");
				if (rdbtnDomesticCustomer.isSelected()) {

					textArea.append(textField_8.getText() + "," + textField_9.getText() + ",\n");
				}
				if (rdbtnInternationalCustomer.isSelected()) {

					textArea.append(textField_10.getText() + "," + textField_11.getText() + "," + textField_12.getText()
							+ ",\n");
				}
				textArea.append("Check In Date " + textField_6.getText() + "," + "Check Out Date "
						+ textField_7.getText() + "," + "Guests " + textField_5.getText() + ", " + roomType);

			}
		});
		btnSave.setBounds(48, 366, 89, 23);
		frame.getContentPane().add(btnSave);

		JButton btnEnter = new JButton("ENTER");
		btnEnter.setBounds(147, 366, 89, 23);
		frame.getContentPane().add(btnEnter);

		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnClearActionPerformed(e);
			}

			private void btnClearActionPerformed(ActionEvent e) {
				rdbtnDomesticCustomer.setSelected(false);
				rdbtnInternationalCustomer.setSelected(false);
				txtTitle.setText(" ");
				txtFirstName.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				textField_5.setText(" ");
				textField_6.setText(" ");
				textField_7.setText(" ");
				textField_8.setText(" ");
				textField_9.setText("");
				textField_10.setText(" ");
				textField_11.setText(" ");
				textField_12.setText(" ");
				comboBox.setSelectedIndex(0);
				textArea.setText(" ");
			}
		});
		btnClear.setBounds(48, 400, 89, 23);
		frame.getContentPane().add(btnClear);

		JButton btnQuit = new JButton("QUIT");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(147, 400, 89, 23);
		frame.getContentPane().add(btnQuit);

		JPanel domesticPanel = new JPanel();
		domesticPanel.setBounds(253, 86, 261, 68);
		domesticPanel.setVisible(false);
		frame.getContentPane().add(domesticPanel);
		domesticPanel.setLayout(null);

		JLabel lblDi = new JLabel("Driver License Number");
		lblDi.setBounds(10, 11, 119, 14);
		domesticPanel.add(lblDi);

		textField_8 = new JTextField();
		textField_8.setText("");
		textField_8.setBounds(165, 8, 86, 20);
		domesticPanel.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblExpiryDate = new JLabel("Expiry Date");
		lblExpiryDate.setBounds(10, 36, 80, 14);
		domesticPanel.add(lblExpiryDate);

		textField_9 = new JTextField();
		textField_9.setBounds(165, 33, 86, 20);
		domesticPanel.add(textField_9);
		textField_9.setColumns(10);

		JPanel internationalPanel = new JPanel();
		internationalPanel.setBounds(524, 85, 232, 106);
		internationalPanel.setVisible(false);
		frame.getContentPane().add(internationalPanel);
		internationalPanel.setLayout(null);

		JLabel lblPassportNumber = new JLabel("Passport Number");
		lblPassportNumber.setBounds(10, 11, 92, 14);
		internationalPanel.add(lblPassportNumber);

		textField_10 = new JTextField();
		textField_10.setBounds(112, 8, 86, 20);
		internationalPanel.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Country");
		lblNewLabel_1.setBounds(10, 42, 46, 14);
		internationalPanel.add(lblNewLabel_1);

		textField_11 = new JTextField();
		textField_11.setBounds(112, 39, 86, 20);
		internationalPanel.add(textField_11);
		textField_11.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Expiry Date");
		lblNewLabel_2.setBounds(10, 67, 92, 14);
		internationalPanel.add(lblNewLabel_2);

		textField_12 = new JTextField();
		textField_12.setBounds(112, 64, 86, 20);
		internationalPanel.add(textField_12);
		textField_12.setColumns(10);
// Radio button code
		rdbtnDomesticCustomer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtnDomesticActionPerformed(evt);
			}

			private void rdbtnDomesticActionPerformed(ActionEvent evt) {
				if (rdbtnDomesticCustomer.isSelected()) {
					internationalPanel.setVisible(false);
					domesticPanel.setVisible(true);
					rdbtnInternationalCustomer.setSelected(false);
				}
			}
		});

		rdbtnInternationalCustomer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtnInternationalActionPerformed(evt);
			}

			private void rdbtnInternationalActionPerformed(ActionEvent evt) {
				if (rdbtnInternationalCustomer.isSelected()) {
					internationalPanel.setVisible(true);
					domesticPanel.setVisible(false);
					rdbtnDomesticCustomer.setSelected(false);
				}
			}
		});

	}

}
