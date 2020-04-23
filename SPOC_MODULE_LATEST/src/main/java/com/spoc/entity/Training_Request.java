package com.spoc.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="training_request")
public class Training_Request {
	@Id
	private int requestId;
	private int verticalId;
	private int technologyId;
	public Training_Request() {
		
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getVerticalId() {
		return verticalId;
	}
	public void setVerticalId(int verticalId) {
		this.verticalId = verticalId;
	}
	public int getTechnologyId() {
		return technologyId;
	}
	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}
	
	 @Override public String toString() { 
		 return "Training_Request [requestId=" +
	 requestId + ", verticalId=" + verticalId + ", technologyId=" + technologyId +
	 "]"; }
	 
	
}
