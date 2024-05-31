import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SignUp2 implements ActionListener{
	
	JFrame frame;
	JLabel cardNoLabel;
	JLabel pinLabel; 
	JTextField cardNoField;
	JTextField pinField;
	JButton submitButton;
	
	SignUp2() {
		
		frame = new JFrame();
		cardNoLabel = new JLabel("Card No:");
		pinLabel = new JLabel("Pin:");
		cardNoField = new JTextField();
		pinField = new JTextField();
		submitButton = new JButton("Submit");
		
		cardNoLabel.setBounds(60,150,200,50);
		cardNoLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		
		cardNoField.setBounds(250, 160, 400, 32);
		
		pinLabel.setBounds(60,200, 200, 50);
		pinLabel.setFont(new Font("MV Boli", Font.BOLD, 18));
		
		pinField.setBounds(250, 210, 400, 32);
		
		submitButton.setBounds(550, 710, 100, 32);
		submitButton.setFocusable(false);
		submitButton.setBackground(Color.black);
		submitButton.setForeground(Color.white);
		submitButton.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 800);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(cardNoLabel);
		frame.add(pinLabel);
		frame.add(cardNoField);
		frame.add(pinField);
		frame.add(submitButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submitButton) 
		{
			String cardNo = cardNoField.getText();
			String pin = pinField.getText();
			
			try {
				if(cardNo.equals("")) {
					JOptionPane.showMessageDialog(null, "Card No is Required");
				}
				else {
					Conn c = new Conn();
					String query = "insert into login values('"+cardNo+"', '"+pin+"')";
					c.s.executeUpdate(query);
				}
			} catch(Exception e1) {
				System.out.println(e1);
			}
			frame.dispose();
			
		}
		
	}

}
