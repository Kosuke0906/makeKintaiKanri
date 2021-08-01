package been;

public class UserInfo {
	private String id;
	private String pass;
	private  String name;
	private boolean LOGINFLAG;
	public UserInfo() {
		this.LOGINFLAG = false;
	}
	public UserInfo(String id, String pass, String name) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.LOGINFLAG = true;
	}
	public String getId() {
		return this.id;
	}
	public String getPass() {
		return this.pass;
	}
	public String getName() {
		return this.name;
	}
	public boolean getLoginChk() {
		return this.LOGINFLAG;
	}
}
