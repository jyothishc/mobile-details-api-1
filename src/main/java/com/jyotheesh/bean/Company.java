package com.jyotheesh.bean;

public class Company {
	private String companyName;
	private String companyEmail;
	private String companyPhone;
	private String companyAddress;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyEmail=" + companyEmail + ", companyPhone="
				+ companyPhone + ", companyAddress=" + companyAddress + "]";
	}
	

}
