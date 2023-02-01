package com.jyotheesh.service;

import com.jyotheesh.bean.Company;
import com.jyotheesh.model.Mobile;

public interface MobileServiceInterface {

	public void createMobileData(Mobile mobile);

	public  Mobile getMobileDetails(String mobileName);
		
	

	public Company getCompanyDetails();

	public Mobile updateMobileDetails(String colour);
	}



