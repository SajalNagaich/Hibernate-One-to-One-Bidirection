package com.companyname.clientname.dao;



import com.companyname.clientname.entity.Adharcard;
import com.companyname.clientname.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonWithAdharDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	public Person savePersonWithAdhar(Person person) {
		try {
			et.begin();
			em.persist(person);
			et.commit();
			return person;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public Adharcard getAdharUsingAdharNumber(Long adharId) {
		return em.find(Adharcard.class, adharId);
	}
	
	public Person getPersonUsingAdhar(Long adharId) {
		return em.find(Adharcard.class, adharId).getPerson();
	}
	
	public Person getPersonUsingPersonId(int personId) {
		return em.find(Person.class, personId);
	}
	
	public Adharcard getAdharUsingPersonId(int personId) {
		return em.find(Person.class, personId).getAdhar();
	}
	
	
}
