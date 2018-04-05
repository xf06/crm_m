package crm_mgr_test.com.apis;

public class ComStatus {

	public static final int INPUT_NORMSG_LENGTH = 25;
	public static final int INPUT_EMAIL_LENGTH = 45;

	public static Boolean userFormatCheck(String user) {return true;}
	public static Boolean useridFormatCheck(int userid) {return true;}
	public static Boolean emailFormatCheck(String email) {return true;}
	public static Boolean passwdFormatCheck(String passwd) {return true;}

	
	// 0x8002 MLoginAns
	public static enum LoginStatus {
		SUCCESS, 
		WRONG_MSGID,
		REQID_ERROR,
		ILLEGAL_USER,
		PASSWD_LENGTH_ERR,
		VARCODE_LENGTH_ERR,
		USER_FORMAT_ERR,
		USERID_FORMAT_ERR,
		EMAIL_FORMAT_ERR,
		PASSWD_FORMAT_ERR,
		VARCODE_FORMAT_ERR,
		PASSWD_USER_NO_MATCH,
		UNKNOWN
	}

	// 0x8008 MForgotPwAns
	public static enum ForgotPwStatus {
		SUCCESS,
		WRONG_MSGID,
		REQID_ERROR,
		VARCODE_LENGTH_ERR,
		EMAIL_FORMAT_ERR,
		VARCODE_FORMAT_ERR,
		UNKNOWN
	}

	// 0x800A mResetPwAns
	public static enum ResetPwStatus {
		SUCCESS, UNKNOWN
	}

	// 0x8012 mChangePwAns
	public static enum ChangePwStatus {
		SUCCESS, UNKNOWN
	}
	
	/*
	//0x80FF
	public static enum ChangePwStatus {
		SUCCESS, UNKNOWN
	}
	*/
	
}
