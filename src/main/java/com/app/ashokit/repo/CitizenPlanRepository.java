package com.app.ashokit.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ashokit.binding.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository <CitizenPlan, Serializable>{

	public List<String> getPlanName();

	public List<String> getPlanStatus();

}
