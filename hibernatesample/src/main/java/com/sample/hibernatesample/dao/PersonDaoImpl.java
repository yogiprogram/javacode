package com.sample.hibernatesample.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.hibernatesample.domain.DepartmentDetail;
import com.sample.hibernatesample.domain.Employee;
import com.sample.hibernatesample.domain.Person;

import antlr.collections.List;

@Repository
public class PersonDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	 
	@Transactional
	public void add(Person person) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(person);
	}
	
	
	@Transactional
	public Person get(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		return  (Person)session.get(Person.class, id);
	}
}
