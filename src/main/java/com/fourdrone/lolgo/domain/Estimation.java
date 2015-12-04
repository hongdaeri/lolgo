package com.fourdrone.lolgo.domain;

import java.sql.Timestamp;

public class Estimation {
	private int crewId;
	private String estimator;
	private String estimatorTarget;
	private Timestamp estimationDate;
	private int top;
	private int mid;
	private int jungle;
	private int onedeal;
	private int support;
	private int mental;
	private int carry;
	
	public int getCrewId() {
		return crewId;
	}
	public void setCrewId(int crewId) {
		this.crewId = crewId;
	}
	public String getEstimator() {
		return estimator;
	}
	public void setEstimator(String estimator) {
		this.estimator = estimator;
	}
	public String getEstimatorTarget() {
		return estimatorTarget;
	}
	public void setEstimatorTarget(String estimatorTarget) {
		this.estimatorTarget = estimatorTarget;
	}
	public Timestamp getEstimationDate() {
		return estimationDate;
	}
	public void setEstimationDate(Timestamp estimationDate) {
		this.estimationDate = estimationDate;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getJungle() {
		return jungle;
	}
	public void setJungle(int jungle) {
		this.jungle = jungle;
	}
	public int getOnedeal() {
		return onedeal;
	}
	public void setOnedeal(int onedeal) {
		this.onedeal = onedeal;
	}
	public int getSupport() {
		return support;
	}
	public void setSupport(int support) {
		this.support = support;
	}
	public int getMental() {
		return mental;
	}
	public void setMental(int mental) {
		this.mental = mental;
	}
	public int getCarry() {
		return carry;
	}
	public void setCarry(int carry) {
		this.carry = carry;
	}
	
	
}
