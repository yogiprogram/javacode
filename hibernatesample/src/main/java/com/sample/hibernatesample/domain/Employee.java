package com.sample.hibernatesample.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@Column
	int id;

	@Column
	String firstName;
	@Column
	String lastName;

	@ManyToOne
	@JoinColumn(name = "depId")
	DepartmentDetail departmentDetail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the departmentDetail
	 */
	public DepartmentDetail getDepartmentDetail() {
		return departmentDetail;
	}

	/**
	 * @param departmentDetail
	 *            the departmentDetail to set
	 */
	public void setDepartmentDetail(DepartmentDetail departmentDetail) {
		this.departmentDetail = departmentDetail;
	}

	@Override
	public String toString() {
		return "[ ID " + this.id + " Name : " + this.firstName + " " + this.lastName + " ]";
	}

}
