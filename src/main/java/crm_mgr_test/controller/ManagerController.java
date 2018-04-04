package crm_mgr_test.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import crm_mgr_test.com.apis.ComStatus;
import crm_mgr_test.com.apis.MChangePw;
import crm_mgr_test.com.apis.MChangePwAns;
import crm_mgr_test.com.apis.MForgotPw;
import crm_mgr_test.com.apis.MForgotPwAns;
import crm_mgr_test.com.apis.MLogin;
import crm_mgr_test.com.apis.MLoginAns;
import crm_mgr_test.com.apis.MResetPw;
import crm_mgr_test.com.apis.MResetPwAns;
import crm_mgr_test.dao.ManagerDao;
import crm_mgr_test.domain.Manager;


@RestController
public class ManagerController {

	// investigate this first
	@Autowired
    private ManagerDao managerDao;
	
	@RequestMapping("/getManager")
	@ResponseBody
	public Manager getManger() {
		return managerDao.getManager();
	}
	
	
// POST method 
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public MLoginAns login(MLogin mlg) {
		
		
		//System.out.println(managerDao.getMidFromMidPW(2, "1234"));
		
		// check if input are legal
		ComStatus.LoginStatus st = mlg.reviewData();
		
		// construct ans message
		MLoginAns ans = new MLoginAns(mlg.getRequestid());
		
		//#define debug
		ans.setEmail(mlg.getEmail());
		ans.setLoginname(mlg.getLoginname());
		ans.setManagerid(mlg.getManagerid());
		//#####
		
		if(st!=ComStatus.LoginStatus.SUCCESS) {
			ans.setStatus(st);
			return ans;
		}
		
		// code verification check
		
		// database email and passwd check
		if((mlg.getEmail()!=null)&&(!mlg.getEmail().equals(""))) {
			
			if(managerDao.getEmailFromEmailPW(mlg.getEmail(), mlg.getPassword())!=null)
				ans.setStatus(ComStatus.LoginStatus.SUCCESS);
			else
				ans.setStatus(ComStatus.LoginStatus.PASSWD_USER_NO_MATCH);
			
			return ans;
		}
		
		// database loginname and passwd check
		if((mlg.getLoginname()!=null)&&(!mlg.getLoginname().equals(""))) {
			if(managerDao.getUserFromUserPW(mlg.getLoginname(),mlg.getPassword())!=null)
				ans.setStatus(ComStatus.LoginStatus.SUCCESS);
			else 
				ans.setStatus(ComStatus.LoginStatus.PASSWD_USER_NO_MATCH);
			
			return ans;
		}
		
		// database managerid and passwd check
		if(mlg.getManagerid()!=0) {
			if(managerDao.getMidFromMidPW(mlg.getManagerid(), mlg.getPassword())!=null)
				ans.setStatus(ComStatus.LoginStatus.SUCCESS);
			else 
				ans.setStatus(ComStatus.LoginStatus.PASSWD_USER_NO_MATCH);
			
			return ans;
		}
		
		ans.setStatus(ComStatus.LoginStatus.UNKNOWN);
	
		return ans;//java class convert to json
	}

	@RequestMapping("/forgot")
	@ResponseBody
	public MForgotPwAns forgotPasswords(MForgotPw fgpw, HttpServletRequest req) {		
		// check if input legal
		MForgotPwAns ans = new MForgotPwAns();
		// contruct return message
		ans.requestid(fgpw.requestid()).email(fgpw.email()).status(fgpw.reviewdata());
		
		// perform business logic
		if(ans.status()!= ComStatus.ForgotPwStatus.SUCCESS) {
			return ans;
		}
		
		// request id		
		// message id
		
		return ans;
	}
	
//	mResetPw	0x8009	{requestid, sessionid,managerid,passwords,repasswords}	HTTP
//	mResetPwAns	0x800A	{requestid, sessionid,managerid,status,comment}	HTTP
	@RequestMapping("/reset")
	@ResponseBody
	public MResetPwAns resetPasswords(MResetPw rspw, HttpServletRequest req) {
		// check if input legal
		MResetPwAns ans = new MResetPwAns();
		
		ans.requestid(rspw.requestid()).status(rspw.reviewdata());
		return ans;
	}
	
//	mChangePw	0x8011	{requestid, sessionid, managerid, oldpw, newpw, repw }	HTTP
//	mChangePwAns	0x8012	{requestid, sessionid, managerid, status, comment}	HTTP
	@RequestMapping("/changepw")
	@ResponseBody
	public MChangePwAns changePasswords(MChangePw cgpw, HttpServletRequest req)	{
		// check if input legal construct answer object
		MChangePwAns ans = new MChangePwAns();
		
		return ans;
	}
	
	/*
	// investigate this first
	@Autowired
    private ManagerDao managerDao;
	
	@RequestMapping("/getManager")
	@ResponseBody
	public Manager getManger() {
		return managerDao.getManager();
	}
	*/
}

  