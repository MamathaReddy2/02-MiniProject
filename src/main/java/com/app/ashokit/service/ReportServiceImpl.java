package com.app.ashokit.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.ashokit.binding.CitizenPlan;
import com.app.ashokit.binding.SearchRequest;
import com.app.ashokit.repo.CitizenPlanRepository;

public class ReportServiceImpl implements ReportService {
	@Autowired
	private CitizenPlanRepository repository;

	@Override
	public List<String> getPlanName() {
		return repository.getPlanName();
	}

	@Override
	public List<String> getPlanStatus() {
		return repository.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> getCitizenPlans(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exportExcel(HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exportPdf(HttpServletRequest response) {
		// TODO Auto-generated method stub

	}

}
