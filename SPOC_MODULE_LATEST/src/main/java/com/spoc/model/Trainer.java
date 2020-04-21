package com.spoc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {

	@Id
	private int Trainer_id;
	private String Trainer_name;
	private boolean Trainer_status;
	private String date;
	private String Technology_id;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainer_id, String trainer_name, boolean trainer_status, String date, String technology_id) {
		super();
		Trainer_id = trainer_id;
		Trainer_name = trainer_name;
		Trainer_status = trainer_status;
		this.date = date;
		Technology_id = technology_id;
	}
	public int getTrainer_id() {
		return Trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		Trainer_id = trainer_id;
	}
	public String getTrainer_name() {
		return Trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		Trainer_name = trainer_name;
	}
	public boolean isTrainer_status() {
		return Trainer_status;
	}
	public void setTrainer_status(boolean trainer_status) {
		Trainer_status = trainer_status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTechnology_id() {
		return Technology_id;
	}
	public void setTechnology_id(String technology_id) {
		Technology_id = technology_id;
	}
	
	
	

}