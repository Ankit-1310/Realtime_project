package com.anku.service;

import java.util.List;

import com.anku.entity.CitizenPlan;
import com.anku.request.SearchRequest;

public interface ReportService {

	public List<String> getPlaneName();
	public List<String> getPlaneStatus();
	public List<CitizenPlan> search(SearchRequest request);

	public boolean exportExel();
	public boolean exportPdf();


}
