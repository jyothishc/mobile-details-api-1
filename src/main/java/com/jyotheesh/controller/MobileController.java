package com.jyotheesh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jyotheesh.bean.Company;
import com.jyotheesh.model.Mobile;
import com.jyotheesh.service.MobileServiceInterface;

@RequestMapping("/mobile/api")
@RestController
public class MobileController {

	private static final Logger logger = LoggerFactory.getLogger(MobileController.class);
	@Autowired
	private MobileServiceInterface mobileServiceInterface;

	@PostMapping("/create-mobile")
	public void createMobileData(@RequestBody Mobile mobile) {
		logger.info("Create Mobile Data :: " + mobile);
		mobileServiceInterface.createMobileData(mobile);
	}

	@GetMapping("/get-mobile-details")
	public Mobile getMobileDetails(@RequestParam String mobileName) {
		Mobile mobileDetails = new Mobile();
		Company companyDetails = new Company();
		logger.info("Company Details in Controller :: " + companyDetails);
		return mobileDetails;

	}
	@PutMapping("/update-mobile-details")
	public Mobile updateMobileDetails(@RequestParam String colour ) {
		Mobile mobileDetails = mobileServiceInterface.updateMobileDetails(colour);
		return mobileDetails;
	}
	
}