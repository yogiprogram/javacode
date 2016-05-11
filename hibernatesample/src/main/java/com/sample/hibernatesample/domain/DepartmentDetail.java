package com.sample.hibernatesample.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.type.descriptor.sql.JdbcTypeFamilyInformation.Family;

@Entity
@Table
public class DepartmentDetail {

	@Id
	@Column
	@GeneratedValue
	int depId;

	@Column
	String depName;


	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy="departmentDetail")
	Set<Employee> employees;
	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
