import java.sql.*;

public class Conn {

	Connection c; 
	Statement s; 
	
	public Conn() {
	try {
		c= DriverManager.getConnection("jdbc:mariadb://localhost:3306/bankmanagementsystem", "root", "1234");
		s = c.createStatement();
		}	
	
	catch (Exception e) {
		System.out.println(e);
	}
}

}
// Hey copilot
// i have created database using datagrip now how do i connect and use it here
// i have created a database named bankmanagementsystem
// and a table named login
// Your answer:
