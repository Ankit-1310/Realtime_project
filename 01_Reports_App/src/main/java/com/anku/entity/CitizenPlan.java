package com.anku.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data

@Entity
@Table(name="CITIZEN_PLAN_INFO")
public class CitizenPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planeName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double bendfitAmount;
	private String denialReson;
	private LocalDate terminatedDate;
	private String terminationReson;

}
