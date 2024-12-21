package com.companyname.clientname.controller;

import java.time.LocalDate;

import com.companyname.clientname.dao.PersonWithAdharDAO;
import com.companyname.clientname.entity.Adharcard;
import com.companyname.clientname.entity.Person;
public class SavePersonWithAdharController {

	public static void main(String[] args) {

		PersonWithAdharDAO dao = new PersonWithAdharDAO();
		Adharcard adhar = new Adharcard(12265545547464L,"Prathmesh Nagaich" , "Noida", LocalDate.parse("2000-06-04"), null);
		Person person = new Person(1223,"sajal","sajalnagaich6266@gmail.com",6266700509L,adhar);
		dao.savePersonWithAdhar(person);
		
		
		}

}
