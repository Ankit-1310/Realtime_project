package com.anku.unittesting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anku.unittesting.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	@Query("Select CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END FROM personId")
	 Boolean isPersonExistedById(Integer personId) ;

}
