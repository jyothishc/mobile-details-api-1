package com.jyotheesh.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "mobile_details")
public class Mobile {
	
	@Column(name ="ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mobileId;
	
	@Column(name = "NAME")
	private String mobileName;
	
	@Column(name = "COLOUR")
	private String mobileColour;
	
	@Column(name = "PRICE")
	private int mobilePrice;
	
	@Column(name = "STROAGE")
	private String mobileStroage;
	
	@Column(name = "RAM")
	private String mobileRam;

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
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
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileColour=" + mobileColour
				+ ", mobilePrice=" + mobilePrice + ", mobileStroage=" + mobileStroage + ", mobileRam=" + mobileRam
				+ "]";
	}

}

