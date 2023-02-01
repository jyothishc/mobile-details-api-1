package com.jyotheesh.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jyotheesh.bean.Company;
import com.jyotheesh.model.Mobile;
import com.jyotheesh.repository.MobileRepository;
@Service
public class MobileServiceImpl implements MobileServiceInterface {

	@Autowired 
	private MobileRepository mobileRepository;
	private static final Logger logger = LoggerFactory.getLogger(MobileServiceImpl.class);
 
	@Override
	public void createMobileData(Mobile mobile) {
		logger.info("Mobile Data in Service Layer ::"+mobile);
		mobileRepository.save(mobile);
		
		
		
	}

	@Override
	public Mobile getMobileDetails(String mobileName) {
		Mobile mobile = mobileRepository.findByMobileName(mobileName);
		return mobile;
	}

	@Override
	public Company getCompanyDetails() {
	Company company = new Company();
	company.setCompanyName("Apple");
	company.setCompanyEmail("apple.gmail.com");
	company.setCompanyPhone("+91 213165489");
	company.setCompanyAddress("Hydrabad");
		return company;
	}

	@Override
	public Mobile updateMobileDetails(String colour) {
		
		return null;
	}

}
