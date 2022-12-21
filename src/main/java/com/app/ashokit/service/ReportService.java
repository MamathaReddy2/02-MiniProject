package com.app.ashokit.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.ashokit.binding.CitizenPlan;
import com.app.ashokit.binding.SearchRequest;

public interface ReportService {

	public List<String> getPlanName();

	public List<String> getPlanStatus();

	public List<CitizenPlan> getCitizenPlans(SearchRequest request);

	public void exportExcel(HttpServletResponse response);

	public void exportPdf(HttpServletRequest response);
}
