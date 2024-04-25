package com.anku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.anku.entity.CitizenPlan;
import com.anku.request.SearchRequest;
import com.anku.service.ReportService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ReportController {

	@Autowired
	private ReportService service;

	@PostMapping("/search")
	public String handelSearch(SearchRequest request, Model m) {
		System.out.println(request);
		List<CitizenPlan> plans = service.search(request);
		m.addAttribute("plans", plans);
		init(m);
		return "index";
	}

	@GetMapping("/")
	public String indexPage(Model m) {
		init(m);
		return "index";
	}

	private void init(Model m) {
		m.addAttribute("search", new SearchRequest());
		m.addAttribute("name", service.getPlaneName());
		m.addAttribute("status", service.getPlaneStatus());
	}

}
