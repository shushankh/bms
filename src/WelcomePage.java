import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class WelcomePage implements ActionListener{

	JFrame frame; 
	JButton logOut;
	JButton AccountDetails;
	JButton cashWithdrawl;
	JButton cashDeposit;
	JPanel detailsPanel;
	JLabel bankName;
	String pin;
	WelcomePage(String pinNumber){
		
		this.pin = pinNumber;
		frame = new JFrame();
		logOut = new JButton("Logout");
		AccountDetails = new JButton("AccountDetails");
		cashWithdrawl = new JButton("CashWithdrawl");
		cashDeposit = new JButton("CashDeposit");
		detailsPanel = new JPanel();
		bankName = new JLabel("Rozan Bank Ltd.");
		
		AccountDetails.setBounds(35, 200, 200, 50);
		AccountDetails.setFocusable(false);
		AccountDetails.addActionListener(this);
		
		cashWithdrawl.setBounds(235, 200, 200, 50);
		cashWithdrawl.setFocusable(false);
		cashWithdrawl.addActionListener(this);
		
		cashDeposit.setBounds(435, 200, 150, 50);
		cashDeposit.setFocusable(false);
		cashDeposit.addActionListener(this);
		
		logOut.setBounds(250,300,100,40);
		logOut.setFocusable(false);
		logOut.addActionListener(this);
		
		detailsPanel.setBounds(120, 50, 400, 100);
		detailsPanel.setBackground(Color.WHITE);
		detailsPanel.setLayout(null);
		
		bankName.setBounds(100,20,200,50);
		bankName.setFont(new Font("MV Boli", Font.BOLD, 20));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(600,400);
		frame.setVisible(true);
		frame.add(logOut);
		frame.add(AccountDetails);
		frame.add(cashWithdrawl);
		detailsPanel.add(bankName);
		frame.add(detailsPanel);
		frame.add(cashDeposit);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == logOut) {
			frame.dispose();
		}
		if(e.getSource() == cashDeposit) {
			frame.dispose();
			new Deposit(pin);
		}
		if(e.getSource() == cashWithdrawl) {
			new Withdrawl(pin);
		}
		if(e.getSource() == AccountDetails) { 
			new AccDetails(pin);
		}
	}
}
