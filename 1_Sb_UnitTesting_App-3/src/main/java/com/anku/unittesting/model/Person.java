package com.anku.unittesting.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Person {
	
	private int personId;
	private String personName;
	private String personAddress;

}
