import java.util.HashMap;

public class IDandPasswords {

	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IDandPasswords() {
		loginInfo.put("123456789012", "1234");
		loginInfo.put("187234918732", "4321");
		loginInfo.put("189237472349", "9874");
	}
	
	protected HashMap getLoginInfo() {
		return loginInfo;
	}
	
}
