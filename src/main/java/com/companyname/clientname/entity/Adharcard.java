package com.companyname.clientname.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adharcard {
	@Id
	private long id;
	private String fathername;
	private String address;
//	@UpdateTimestamp
//	@CreationTimestamp
	private LocalDate dob;
	@OneToOne(mappedBy = "adhar",fetch = FetchType.LAZY)
	private Person person;
	@Override
	public String toString() {
		return "Adharcard [id=" + id + ", fathername=" + fathername + ", address=" + address + ", dob=" + dob
				+ "]";
	}

}
