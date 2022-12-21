package com.app.ashokit.binding;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="CITIZENS_PLANS_INFO")

public class CitizenPlan {
	
	private Integer cid;
	private String planName;
	private String planStatus;
	private String cname;
	private String cemail;
	private String gender;
	private Long phno;
	private Long ssn;

}
