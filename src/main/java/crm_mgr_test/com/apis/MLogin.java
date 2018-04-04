package crm_mgr_test.com.apis;

import java.util.UUID;

public class MLogin {
	
	private String messageid;

	private UUID requestid;

	private int managerid; 
	
	private String loginname;

	private String email;
	
	private String password;		// 30 char

	private String verficationcode;// 20 char
	
	
	public MLogin(){
		this.messageid = "8001";
	}
	
	public MLogin(UUID requestid) {
		this.messageid = "8001";
		this.requestid = requestid;//
		this.password = new String();//
		this.verficationcode = new String();//
	}

	// getters and setters
	
	public String getMessageid() {
		return messageid;
	}

	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}

	public UUID getRequestid() {
		return requestid;
	}

	public void setRequestid(UUID requestid) {
		this.requestid = requestid;
	}

	public int getManagerid() {
		return managerid;
	}
	
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	
	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerficationcode() {
		return verficationcode;
	}

	public void setVerficationcode(String verficationcode) {
		this.verficationcode = verficationcode;
	}




}
