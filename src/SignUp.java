import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUp implements ActionListener {

	JFrame frame = new JFrame();
	
	JLabel header1 = new JLabel("APPLICATION FORM NO. 6211");
	JLabel header2 = new JLabel("Page 1: Personal Details");
	
	JLabel nameLabel = new JLabel("Name:");
	JLabel fatherLabel = new JLabel("Father's Name:");
	JLabel motherLabel = new JLabel("Mother's Name:");
	JLabel dobLabel = new JLabel("Date of Birth: ");
	JLabel genderLabel = new JLabel("Gender: ");
	JLabel emailLabel = new JLabel("Email Address: ");
	JLabel maritalLabel = new JLabel("Maritial Status: ");
	JLabel addressLabel = new JLabel("Address: ");
	JLabel cityLabel = new JLabel("City: ");
	JLabel pinCodeLabel = new JLabel("Pin Code: ");
	JLabel stateLabel = new JLabel("State: ");
	JButton nextButton = new JButton("Next");
	
	JTextField nameField = new JTextField();
	JTextField fatherField = new JTextField();
	JTextField motherField = new JTextField();
	JTextField dateField = new JTextField();
	
	JRadioButton maleButton = new JRadioButton("Male");
	JRadioButton femaleButton = new JRadioButton("Female");
	ButtonGroup genderGroup = new ButtonGroup();
	
	JTextField emailField = new JTextField();
	
	JRadioButton marriedButton = new JRadioButton("Married");
	JRadioButton unmarriedButton = new JRadioButton("Unmarried");
	JRadioButton otherButton = new JRadioButton("Other");
	ButtonGroup maritalGroup = new ButtonGroup();
	
	JTextField addressField = new JTextField();
	JTextField cityField = new JTextField();
	JTextField pinCodeField = new JTextField();
	JTextField stateField = new JTextField();
	
	SignUp(){
		
		header1.setBounds(100,20,500,50);
		header1.setFont(new Font("MV Boli", Font.BOLD, 30));
		
		header2.setBounds(200,45,400,100);
		header2.setFont(new Font("MV Boli", Font.BOLD, 20));
		
		nameLabel.setBounds(60,150,200,50);
		nameLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		
		nameField.setBounds(250, 160, 400, 32);
		
		fatherLabel.setBounds(60,200, 200, 50);
		fatherLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		
		fatherField.setBounds(250, 210, 400, 32);
		
		motherLabel.setBounds(60, 250, 200, 50);
		motherLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		
		motherField.setBounds(250, 260, 400, 32);
		
		dobLabel.setBounds(60, 300, 200, 50);
		dobLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		
		dateField.setBounds(250, 310, 400, 32);
		
		genderLabel.setBounds(60, 350, 200, 50);
		genderLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		
		maleButton.setBounds(250, 360, 100, 32);
		femaleButton.setBounds(350, 360, 100, 32);
		
		genderGroup.add(maleButton);
		genderGroup.add(femaleButton);
		
		emailLabel.setBounds(60, 400, 200, 50);
		emailLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		
		emailField.setBounds(250, 410, 400, 32);
		
		maritalLabel.setBounds(60, 450, 200, 50);
		maritalLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		
		marriedButton.setBounds(250, 460, 100, 32);
		unmarriedButton.setBounds(350, 460, 100, 32);
		otherButton.setBounds(470, 460, 100, 32);
		
		maritalGroup.add(marriedButton);
		maritalGroup.add(unmarriedButton);
		maritalGroup.add(otherButton);
		
		addressLabel.setBounds(60, 500, 200, 50);
		addressLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		addressField.setBounds(250, 510, 400, 32);
		
		cityLabel.setBounds(60, 550, 200, 50);
		cityLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		cityField.setBounds(250, 560, 400, 32);
		
		pinCodeLabel.setBounds(60, 600, 200, 50);
		pinCodeLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		pinCodeField.setBounds(250, 610, 400, 32);
		
		stateLabel.setBounds(60, 650, 200, 50);
		stateLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		stateField.setBounds(250, 660, 400, 32);
		
		nextButton.setBounds(550, 710, 100, 32);
		nextButton.setFocusable(false);
		nextButton.setBackground(Color.black);
		nextButton.setForeground(Color.white);
		nextButton.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(700,800);
		frame.setVisible(true);
		
		frame.add(header1);
		frame.add(header2);
		frame.add(nameLabel);
		frame.add(nameField);
		frame.add(fatherLabel);
		frame.add(fatherField);
		frame.add(motherLabel);
		frame.add(motherField);
		frame.add(dobLabel);
		frame.add(dateField);
		frame.add(genderLabel);
		
		frame.add(maleButton);
		frame.add(femaleButton);
		
		frame.add(emailField);
		frame.add(emailLabel);
		frame.add(maritalLabel);
		
		frame.add(marriedButton);
		frame.add(unmarriedButton);
		frame.add(otherButton);
		
		frame.add(addressLabel);
		frame.add(addressField);
		frame.add(cityLabel);
		frame.add(cityField);
		frame.add(pinCodeLabel);
		frame.add(pinCodeField);
		frame.add(stateLabel);
		frame.add(stateField);
		frame.add(nextButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == nextButton) {
			SignUp2 signUp2 = new SignUp2();
		
		String name = nameField.getText();
		String fname = fatherField.getText();
		String mname = motherField.getText();
		String dob = dateField.getText();
		String gender = null;
		if(maleButton.isSelected()) {
			gender = "Male";
		} else if (femaleButton.isSelected()) {
			gender = "Female";
		}
		
		String email = emailField.getText();
		String marital = null; 
		if(marriedButton.isSelected()) {
			marital = "Married";
		}	else if(unmarriedButton.isSelected()) {
			marital = "Unmarried";
		} else if(otherButton.isSelected()) {
			marital = "Other";
		}
		
		String address = addressField.getText();
		String city = cityField.getText();
		String state = stateField.getText();
		String pin = pinCodeField.getText(); 
		
		
		try { 
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			} else {
				Conn c = new Conn();
				String query = "insert into signup values('"+name+"', '"+fname+"', '"+mname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
				c.s.executeUpdate(query);
			}
		} catch (Exception e1) {
			System.out.println(e1);
		}
		frame.dispose();
		
		}
	}
}
