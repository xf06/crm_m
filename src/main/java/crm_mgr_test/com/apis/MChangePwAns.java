package crm_mgr_test.com.apis;

import java.util.UUID;

import crm_mgr_test.com.apis.ComStatus.ChangePwStatus;

//mChangePwAns	0x8012	{requestid, sessionid, managerid, status, comment}	HTTP
public class MChangePwAns {
	
	public MChangePwAns() {
		this.messageid = (short)0x8012;
	}
	
	// getters and setters
	// getters
	public short messageid() {
		return this.messageid;
	}
	
	public UUID requestid() {
		return this.requestid;
	}
	
	public String managerid() {
		return this.managerid;
	}
	
	public ChangePwStatus status() {
		return this.status;
	}
	
	public String comment() {
		return this.comment;
	}
	
	// setters
	public MChangePwAns messageid(Integer messageid){
		this.messageid = messageid.shortValue();
		return this;
	}
	
	public MChangePwAns requestid(UUID requestid) {
		this.requestid = requestid;
		return this;
	}
	
	public MChangePwAns requestid(String requestid) {
		
		return this;
	}
	
	
	
	
	private short 			messageid;
	private UUID 			requestid;
	private String 			managerid;
	private ChangePwStatus 	status;
	private String			comment;
}
