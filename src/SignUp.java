import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


import javax.swing.JPanel;



public class SignUp extends JFrame implements ActionListener {
    JLabel header1, header2, nameLabel, fatherLabel, motherLabel, dobLabel, genderLabel, emailLabel, maritalLabel, addressLabel, cityLabel, pinCodeLabel, stateLabel;
    JTextField nameField, fatherField, motherField, dateField, emailField, addressField, cityField, pinCodeField, stateField;
    JRadioButton maleButton, femaleButton, marriedButton, unmarriedButton, otherButton;
    ButtonGroup genderGroup, maritalGroup;
    JButton nextButton;
    JFrame frame;
    JPanel panel;

    SignUp() {
        frame = new JFrame("Sign Up Form");

        header1 = new JLabel("Sign Up Form");
        header1.setBounds(100, 20, 500, 50);
        header1.setFont(new Font("MV Boli", Font.BOLD, 30));

        header2 = new JLabel("Please fill out the form below");
        header2.setBounds(200, 45, 400, 100);
        header2.setFont(new Font("MV Boli", Font.BOLD, 20));

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(60, 150, 200, 50);
        nameLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        nameField = new JTextField();
        nameField.setBounds(250, 160, 400, 32);

        fatherLabel = new JLabel("Father's Name:");
        fatherLabel.setBounds(60, 200, 200, 50);
        fatherLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        fatherField = new JTextField();
        fatherField.setBounds(250, 210, 400, 32);

        motherLabel = new JLabel("Mother's Name:");
        motherLabel.setBounds(60, 250, 200, 50);
        motherLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        motherField = new JTextField();
        motherField.setBounds(250, 260, 400, 32);

        dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(60, 300, 200, 50);
        dobLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        dateField = new JTextField();
        dateField.setBounds(250, 310, 400, 32);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(60, 350, 200, 50);
        genderLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        maleButton = new JRadioButton("Male");
        maleButton.setBounds(250, 360, 100, 32);

        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(350, 360, 100, 32);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(60, 400, 200, 50);
        emailLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        emailField = new JTextField();
        emailField.setBounds(250, 410, 400, 32);

        maritalLabel = new JLabel("Marital Status:");
        maritalLabel.setBounds(60, 450, 200, 50);
        maritalLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        marriedButton = new JRadioButton("Married");
        marriedButton.setBounds(250, 460, 100, 32);

        unmarriedButton = new JRadioButton("Unmarried");
        unmarriedButton.setBounds(350, 460, 100, 32);

        otherButton = new JRadioButton("Other");
        otherButton.setBounds(470, 460, 100, 32);

        maritalGroup = new ButtonGroup();
        maritalGroup.add(marriedButton);
        maritalGroup.add(unmarriedButton);
        maritalGroup.add(otherButton);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(60, 500, 200, 50);
        addressLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        addressField = new JTextField();
        addressField.setBounds(250, 510, 400, 32);

        cityLabel = new JLabel("City:");
        cityLabel.setBounds(60, 550, 200, 50);
        cityLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        cityField = new JTextField();
        cityField.setBounds(250, 560, 400, 32);

        pinCodeLabel = new JLabel("Pin Code:");
        pinCodeLabel.setBounds(60, 600, 200, 50);
        pinCodeLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        pinCodeField = new JTextField();
        pinCodeField.setBounds(250, 610, 400, 32);

        stateLabel = new JLabel("State:");
        stateLabel.setBounds(60, 650, 200, 50);
        stateLabel.setFont(new Font("MV Boli", Font.BOLD, 18));

        stateField = new JTextField();
        stateField.setBounds(250, 660, 400, 32);

        nextButton = new JButton("Next");
        nextButton.setBounds(275, 700, 150, 50);
        nextButton.setFocusable(false);
        nextButton.setBackground(Color.black);
        nextButton.setForeground(Color.white);
        nextButton.addActionListener(this);

        // Panel to hold all components
        panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(800, 1000)); // Adjust the size as needed

        // Add components to panel
        panel.add(header1);
        panel.add(header2);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(fatherLabel);
        panel.add(fatherField);
        panel.add(motherLabel);
        panel.add(motherField);
        panel.add(dobLabel);
        panel.add(dateField);
        panel.add(genderLabel);
        panel.add(maleButton);
        panel.add(femaleButton);
        panel.add(emailField);
        panel.add(emailLabel);
        panel.add(maritalLabel);
        panel.add(marriedButton);
        panel.add(unmarriedButton);
        panel.add(otherButton);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(pinCodeLabel);
        panel.add(pinCodeField);
        panel.add(stateLabel);
        panel.add(stateField);
        panel.add(nextButton);

        // Scroll pane to hold the panel
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Add scroll pane to frame
        frame.add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600); // Set the frame size
        frame.setVisible(true);
    }

    


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == nextButton) {
			new SignUp2();
		
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
