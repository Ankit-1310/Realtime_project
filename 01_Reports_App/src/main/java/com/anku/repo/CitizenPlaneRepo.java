package com.anku.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anku.entity.CitizenPlan;

public interface CitizenPlaneRepo extends JpaRepository<CitizenPlan, Integer> {

	@Query("select distinct(planeName) from CitizenPlan")
	public List<String> getPlaneNames();

	@Query("select distinct(planStatus) from CitizenPlan")
	public List<String> getPlaneStatus();

}
