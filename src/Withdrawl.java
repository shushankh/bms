import java.awt.Color;
import java.util.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class Withdrawl extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JButton clear;
	JTextField amountField;
	JButton withdrawl;
	JLabel text;
	String pin;
	Withdrawl(String pinNumber) {
		
		this.pin = pinNumber;
		text = new JLabel("Enter the amount You want to withdrawl: ");
		text.setForeground(Color.black);
		text.setFont(new Font("MV Boli", Font.BOLD, 17));
		text.setBounds(50,100,400,20);
		
		amountField = new JTextField();
		amountField.setFont(new Font("MV Boli", Font.BOLD, 22));
		amountField.setBounds(430,100,150,30);
		
		withdrawl = new JButton("Withdrawl");
		withdrawl.setBounds(50, 200, 150, 20);
		withdrawl.setFocusable(false);
		withdrawl.addActionListener(this);
		
		clear = new JButton("Clear");
		clear.setBounds(250, 200, 150, 20);
		clear.setFocusable(false);
		clear.addActionListener(this);
		
		setLayout(null);
		setSize(600, 600);
		setVisible(true);
		this.add(text);
		this.add(amountField);
		this.add(withdrawl);
		this.add(clear);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clear) {
			amountField.setText(null);
		}
		else if(e.getSource() == withdrawl) {
			String number = amountField.getText();
			Date date = new Date();
			if (number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Enter the amount you want to Withdrawl:)");
			} else { 
				try {
					Conn conn = new Conn();
					//get the current balance of the account
					String query1 = "select amount from bank where pin = ?";
					PreparedStatement ps1 = conn.c.prepareStatement(query1);
					ps1.setString(1, pin);
					ResultSet rs = ps1.executeQuery();
					if(rs.next()) {
						double balance = rs.getDouble("amount");
						double amount = Double.parseDouble(number);
						//check if the amount is greater than the balance
						if(amount > balance) {
							JOptionPane.showMessageDialog(null, "Insufficient balance");
						} else if(amount < balance){
							amount = balance - amount;
							//create a new query for the withdrawal
							String query = "insert into bank values(?,?,?,?)"; //use placeholders for the values
							//create a PreparedStatement object
							PreparedStatement ps = conn.c.prepareStatement(query);
							//set the values for the placeholders
							ps.setString(1, pin); //the first placeholder is for the pin
							ps.setDate(2, new java.sql.Date(date.getTime())); //the second placeholder is for the date
							ps.setString(3, "Withdrawal"); //the third placeholder is for the transaction type
							ps.setDouble(4, amount); //the fourth placeholder is for the amount
							//execute the query
							ps.executeUpdate();
							//conn.c.commit();
							JOptionPane.showMessageDialog(null, "Rs "+number+" withdrawl Successfully");
							this.dispose();
							new WelcomePage(pin);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Invalid pin number");
					}
				}	catch (Exception ae) {
					System.out.println(ae);
				}
				
				
			}
		}
		
	}
	
}
