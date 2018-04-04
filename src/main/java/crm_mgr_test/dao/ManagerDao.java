package crm_mgr_test.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import crm_mgr_test.domain.Manager;

@Component
public interface ManagerDao {

	public Manager getManager();
	
	//public String getPasswords(@Param(value="loginname") String loginname);
	
	//public String getEmail(@Param(value="email") String email);
	
	
}
