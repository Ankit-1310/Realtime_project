package com.anku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anku.entity.CitizenPlan;
import com.anku.repo.CitizenPlaneRepo;
import com.anku.request.SearchRequest;
@Service
public class ReportServiceImpl implements ReportService{
	@Autowired
	private CitizenPlaneRepo repo;

	@Override
	public List<String> getPlaneName() {
		return repo.getPlaneNames();
	}

	@Override
	public List<String> getPlaneStatus() {
		return repo.getPlaneStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		return this.repo.findAll();
	}

	@Override
	public boolean exportExel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		return false;
	}

}
