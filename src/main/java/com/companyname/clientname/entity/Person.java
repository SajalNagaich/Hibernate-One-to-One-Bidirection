package com.companyname.clientname.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Person {
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	
	@OneToOne( cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	private Adharcard adhar;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
	
}
