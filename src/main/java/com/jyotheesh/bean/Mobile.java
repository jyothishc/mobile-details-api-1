package com.jyotheesh.bean;

public class Mobile {
	
	private String mobileName;
	private String mobileColour;
	private int mobilePrice;
	private String mobileStroage;
	private String mobileRam;
	
	public Mobile() {
		
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileColour() {
		return mobileColour;
	}
	public void setMobileColour(String mobileColour) {
		this.mobileColour = mobileColour;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public String getMobileStroage() {
		return mobileStroage;
	}
	public void setMobileStroage(String mobileStroage) {
		this.mobileStroage = mobileStroage;
	}
	public String getMobileRam() {
		return mobileRam;
	}
	public void setMobileRam(String mobileRam) {
		this.mobileRam = mobileRam;
	}
	
	@Override
	public String toString() {
		return "Mobile [mobileName=" + mobileName + ", mobileColour=" + mobileColour + ", mobilePrice=" + mobilePrice
				+ ", mobileStroage=" + mobileStroage + ", mobileRam=" + mobileRam + "]";
	}
	
	

}
