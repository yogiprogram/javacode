package com.sample.hibernatesample.domain;

import javax.persistence.Embeddable;

 
@Embeddable
public class Address {

	String lineOne;

	String lineTwo;

	String mobileNumber;

	/**
	 * @return the lineOne
	 */
	public String getLineOne() {
		return lineOne;
	}

	/**
	 * @param lineOne
	 *            the lineOne to set
	 */
	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	/**
	 * @return the lineTwo
	 */
	public String getLineTwo() {
		return lineTwo;
	}

	/**
	 * @param lineTwo
	 *            the lineTwo to set
	 */
	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *            the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
