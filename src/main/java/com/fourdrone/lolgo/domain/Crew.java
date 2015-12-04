package com.fourdrone.lolgo.domain;

import java.sql.Timestamp;

public class Crew {
	private int crewId;
	private String crewName;
	private Timestamp crewRegDate;
	
	public int getCrewId() {
		return crewId;
	}
	public void setCrewId(int crewId) {
		this.crewId = crewId;
	}
	public String getCrewName() {
		return crewName;
	}
	public void setCrewName(String crewName) {
		this.crewName = crewName;
	}
	public Timestamp getCrewRegDate() {
		return crewRegDate;
	}
	public void setCrewRegDate(Timestamp crewRegDate) {
		this.crewRegDate = crewRegDate;
	}
	
}
