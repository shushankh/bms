
import java.awt.Color;
import java.util.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Deposit extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JButton clear;
	JTextField amountField;
	JButton deposit;
	JLabel text;
	String pin;
	Deposit(String pinNumber) {
		
		this.pin = pinNumber;
		text = new JLabel("Enter the amount You want to deposit: ");
		text.setForeground(Color.black);
		text.setFont(new Font("MV Boli", Font.BOLD, 17));
		text.setBounds(50,100,400,20);
		
		amountField = new JTextField();
		amountField.setFont(new Font("MV Boli", Font.BOLD, 22));
		amountField.setBounds(430,100,150,30);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(50, 200, 150, 20);
		deposit.setFocusable(false);
		deposit.addActionListener(this);
		
		clear = new JButton("Clear");
		clear.setBounds(250, 200, 150, 20);
		clear.setFocusable(false);
		clear.addActionListener(this);
		
		setLayout(null);
		setSize(600, 600);
		setVisible(true);
		this.add(text);
		this.add(amountField);
		this.add(deposit);
		this.add(clear);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clear) {
			amountField.setText(null);
		}
		else if(e.getSource() == deposit) {
			String number = amountField.getText();
			Date date = new Date();
			if (number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Enter the amount you want to deposit:)");
			} else { 
				try {
					double balance = 0;
					Conn conn = new Conn();
					String query1 = "select amount from bank where pin = '"+pin+"'";
					ResultSet rs = conn.s.executeQuery(query1);
					if (rs.next()) {
						balance = rs.getDouble("amount");
					}
					double a = balance + Integer.parseInt(number);
					
					String query = "insert into bank values('"+pin+"','"+date+"', 'Deposit', '"+a+"')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs "+number+" Deposited Successfully");
					this.dispose();
					new WelcomePage(pin);
				}	catch (Exception ae) {
					System.out.println(ae);
				}
				
				
			}
		}
		
	}
	
}
