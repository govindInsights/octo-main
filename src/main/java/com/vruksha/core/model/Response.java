package com.vruksha.core.model;

import java.util.Date;

public class Response {

	private String status;
	private Date responseTime;
	private String description;
	
	public Response() {
		this.responseTime = new Date();
		this.status = "SUCCESS";
		this.description = "Submission Processed Successfully";
	}
	public Response(String status, Date responseTime, String description) {
		super();
		this.status = status;
		this.responseTime = responseTime;
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
