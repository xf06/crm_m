package crm_mgr_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crm_mgr_test.com.apis.MLogin;
import crm_mgr_test.com.apis.MLoginAns;


@RestController
public class ManagerController {

	@RequestMapping("/mlogin")
	public String index(MLogin mlg) {
		
		// process login staff here		
		MLoginAns ans = new MLoginAns(mlg.requestid());
		
		// code verification check
		
		// database username and passwd check
		
		ans.loginst(MLoginAns.LoginStatus.SUCCESS);
		//java class convert to json
		return ans.toStr();
	}

	@RequestMapping("/online")
	public String requestOnlineUsers() {
		return "";
	}
	
	@RequestMapping("/top30")
	public String request()	{
		return "";
	}
	
}

  