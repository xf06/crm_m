package crm_mgr_test.com.apis;

import java.util.UUID;

import crm_mgr_test.com.apis.ComStatus.LoginStatus;

public class MLoginAns {

	public MLoginAns(UUID requestid) {
		this.messageid = (short) 0x8002;
		this.requestid = requestid;
	}

	// getters and setters
	// getters
	public final UUID requestid() {
		return this.requestid;
	}

	// sessionid
	public final short messageid() {
		return this.messageid;
	}

	public final long managerid() {
		return this.managerid;
	}

	public final LoginStatus loginst() {
		return this.loginst;
	}

	public final String comment() {
		return this.comment;
	}

	// setters

	public MLoginAns requestid(final UUID requestid) {
		this.requestid = requestid;
		return this;
	}

	public MLoginAns managerid(final long managerid) {
		this.managerid = managerid;
		return this;
	}

	public MLoginAns loginst(final LoginStatus loginst) {
		this.loginst = loginst;
		return this;
	}

	public MLoginAns comment(final String comment) {
		this.comment = comment;
		return this;
	}

	// it is joson or something else
	public String toStr() {
		return "success";
	}

	private UUID requestid;
	// sessionid
	private final short messageid;

	private long managerid;

	private LoginStatus loginst;

	private String comment;

}
