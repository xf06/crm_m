package crm_mgr_test.com.apis;

import java.util.UUID;

//this is a request message

public class MLogin {

	public MLogin(){
		
	}
	
	public MLogin(UUID requestid) {
//		this.messageid = (short) 0x8001;
		this.requestid = requestid;
		this.passwords = new char[30];//
		this.verficationcode = new char[20];//
	}

	// getters and setters
	// getters

	public final UUID requestid() {
		return this.requestid;
	}

	public final short messageid() {
		return this.messageid;
	}

	public final long managerid() {
		return this.managerid;
	}

	public final char[] passwords() {
		return this.passwords;
	}

	public final char[] verificationcode() {
		return this.verficationcode;
	}

	// setters
	public MLogin requestid(final UUID requestid) {
		this.requestid = requestid;
		return this;
	}

	public MLogin managerid(final long managerid) {
		this.managerid = managerid;
		return this;
	}

	public final MLogin passwords(final char[] passwords) {
		this.passwords = passwords;
		return this;
	}

	public final MLogin verficationcode(final char[] verficationcode) {
		this.verficationcode = verficationcode;
		return this;
	}

	// ------------------------------------ //

	private final short messageid = (short) 0x8001;

	private UUID requestid;

	// private long sessionid;

	private long managerid;

	private char[] passwords;// 30 char

	private char[] verficationcode;// 20 char

}
