package com.spoc.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="training_status")
public class Training_Status
{

	@Id
	private int request_id;
	private int status_id;
	private boolean status_state;
	public Training_Status() {
		
	}
	public Training_Status(int request_id, int status_id, boolean status_state) {
		super();
		this.request_id = request_id;
		this.status_id = status_id;
		this.status_state = status_state;
	}
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public boolean isStatus_state() {
		return status_state;
	}
	public void setStatus_state(boolean status_state) {
		this.status_state = status_state;
	}
	
}
