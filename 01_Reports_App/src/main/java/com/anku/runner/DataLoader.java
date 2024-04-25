package com.anku.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.anku.entity.CitizenPlan;
import com.anku.repo.CitizenPlaneRepo;

import lombok.Data;

@Component
@Data
public class DataLoader  implements ApplicationRunner{

	@Autowired
	private CitizenPlaneRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		repo.deleteAll();

		//cash Plane Data
		CitizenPlan c1= new CitizenPlan();
		c1.setCitizenName("Ankit");
		c1.setGender("Male");
		c1.setPlaneName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now() );
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBendfitAmount(50000.00);

		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Anku");
		c2.setGender("Male");
		c2.setPlaneName("Cash");
		c2.setPlanStatus("Denial");
		c2.setDenialReson("Rental Income");

		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Nikku");
		c3.setGender("Male");
		c3.setPlaneName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4) );
		c3.setPlanEndDate(LocalDate.now().plusMonths(2));
		c3.setBendfitAmount(50000.00);
		c3.setTerminatedDate(LocalDate .now());
		c3.setTerminationReson("Employeed");

		//Food Plane Data
		CitizenPlan c4= new CitizenPlan();
		c4.setCitizenName("Smith");
		c4.setGender("Male");
		c4.setPlaneName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now() );
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBendfitAmount(50000.00);

		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("David");
		c5.setGender("Male");
		c5.setPlaneName("Food");
		c5.setPlanStatus("Denial");
		c5.setDenialReson("Property Income");

		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Altif");
		c6.setGender("Male");
		c6.setPlaneName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4) );
		c6.setPlanEndDate(LocalDate.now().plusMonths(2));
		c6.setBendfitAmount(50000.00);
		c6.setTerminatedDate(LocalDate .now());
		c6.setTerminationReson("Employeed");


		//Medical Data

		CitizenPlan c7= new CitizenPlan();
		c7.setCitizenName("Charle");
		c7.setGender("Male");
		c7.setPlaneName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now() );
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBendfitAmount(50000.00);

		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Ravi");
		c8.setGender("Male");
		c8.setPlaneName("Medical");
		c8.setPlanStatus("Denial");
		c8.setDenialReson("Rental Income");

		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Nill");
		c9.setGender("Female");
		c9.setPlaneName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4) );
		c9.setPlanEndDate(LocalDate.now().plusMonths(2));
		c9.setBendfitAmount(50000.00);
		c9.setTerminatedDate(LocalDate .now());
		c9.setTerminationReson("Govt job");

		//Employeement Data

		CitizenPlan c10= new CitizenPlan();
		c10.setCitizenName("steve");
		c10.setGender("Male");
		c10.setPlaneName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now() );
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBendfitAmount(50000.00);

		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Ravindar");
		c11.setGender("Male");
		c11.setPlaneName("Employment");
		c11.setPlanStatus("Denial");
		c11.setDenialReson("Rental Income");

		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Nilkamal");
		c12.setGender("Male");
		c12.setPlaneName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4) );
		c12.setPlanEndDate(LocalDate.now().plusMonths(2));
		c12.setBendfitAmount(50000.00);
		c12.setTerminatedDate(LocalDate .now());
		c12.setTerminationReson("Govt job");

		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		repo.saveAll(list);
	}

}
