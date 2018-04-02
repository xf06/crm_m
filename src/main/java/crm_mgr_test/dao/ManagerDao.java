package crm_mgr_test.dao;

import org.springframework.stereotype.Component;

import crm_mgr_test.domain.Manager;

@Component
public interface ManagerDao {

	//@Select
	public Manager getManager();
	
}
