package com.companyname.clientname.controller;

import com.companyname.clientname.dao.PersonWithAdharDAO;
import com.companyname.clientname.entity.Adharcard;
import com.companyname.clientname.entity.Person;

public class GetPersonUsingAdharCard {
	public static void main(String[] args) {
		
	
	PersonWithAdharDAO dao = new PersonWithAdharDAO();
	
	Adharcard ad = dao.getAdharUsingAdharNumber(12265545547464L);
	
	Person person = dao.getPersonUsingAdhar(12265545547464L);
	
	Person person1 = dao.getPersonUsingPersonId(1223);
	
	Adharcard ad1 = dao.getAdharUsingPersonId(1223);
	System.out.println(ad1);
	
	
	
	
	
	}
}
