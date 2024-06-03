import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*
;
public class LoginPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton signinButton = new JButton("SIGN IN");
	JButton clearButton = new JButton("CLEAR");
	JButton signupButton = new JButton("SIGN UP");
	
	
	ImageIcon atmIcon = new ImageIcon("bank.jpg");
	JLabel atmLabel = new JLabel(atmIcon);
	
	JLabel welcomeLabel = new JLabel("WELCOME TO ATM");
	JLabel cardLabel = new JLabel("Card No: ");
	JLabel pinLabel = new JLabel("PIN: ");
	
	JLabel messageLabel = new JLabel();
	
	JTextField cardField = new JTextField();
	JPasswordField pinField = new JPasswordField();
	
	HashMap<String, String> loginInfo = new HashMap<String,String>();
	
	LoginPage(){
		
		
		welcomeLabel.setBounds(200,50,300,50);
		welcomeLabel.setFont(new Font("MV Boli", Font.BOLD, 27));
		
		atmLabel.setBounds(120,50,50,50);
	
		cardLabel.setBounds(150,100,200,100);
		cardLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		cardField.setBounds(275,132,250,35);
	
		pinLabel.setBounds(150,165,200,100);
		pinLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		pinField.setBounds(275,193,250,35);
		
		signinButton.setBounds(275,300,100,25);
		signinButton.setBackground(Color.black);
		signinButton.setForeground(Color.white);
		signinButton.setFocusable(false);
		signinButton.addActionListener(this);
		
		clearButton.setBounds(400,300,100,25);
		clearButton.setBackground(Color.black);
		clearButton.setForeground(Color.white);
		clearButton.setFocusable(false);
		clearButton.addActionListener(this);
		
		signupButton.setBounds(275,350,225,25);
		signupButton.setBackground(Color.black);
		signupButton.setForeground(Color.white);
		signupButton.setFocusable(false);
		signupButton.addActionListener(this);
		
		messageLabel.setBounds(275, 350, 250, 100);
		messageLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(700,500);
		frame.setVisible(true);
		frame.add(welcomeLabel);
		frame.add(atmLabel);
		frame.add(cardLabel);
		frame.add(cardField);
		frame.add(pinLabel);
		frame.add(pinField);
		frame.add(signinButton);
		frame.add(clearButton);
		frame.add(signupButton);
		frame.add(messageLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == clearButton) {
			cardField.setText(null);
			pinField.setText(null);
		}
		
		if(e.getSource() == signupButton) {
			//SignUp signUp = new SignUp();
			new SignUp();
		}
		
		if(e.getSource() == signinButton) {
			Conn conn = new Conn();
			String cardNo = cardField.getText();
			String pin = String.valueOf(pinField.getPassword());
			String query = "select * from login where cardNo = '"+cardNo+"' and pin = '"+pin+"'";
			
			try {
				ResultSet rs = conn.s.executeQuery(query);
				if (rs.next()) {
					frame.dispose();
					new WelcomePage(pin);
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number of Pin");
				}
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}
	
}
