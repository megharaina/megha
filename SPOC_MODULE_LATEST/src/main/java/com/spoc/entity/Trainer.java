package com.spoc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainer")
public class Trainer {

	@Id
	private int trainer_id;
	private String trainer_name;
	private int technology_id;
	private boolean trainer_status;
	private String date;
	
	public Trainer() {
			}
	public Trainer(int trainer_id, String trainer_name, int technology_id, boolean trainer_status, String date) {
		super();
		this.trainer_id = trainer_id;
		this.trainer_name = trainer_name;
		this.technology_id = technology_id;
		this.trainer_status = trainer_status;
		this.date = date;
	}
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public int getTechnology_id() {
		return technology_id;
	}
	public void setTechnology_id(int technology_id) {
		this.technology_id = technology_id;
	}
	public boolean isTrainer_status() {
		return trainer_status;
	}
	public void setTrainer_status(boolean trainer_status) {
		this.trainer_status = trainer_status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	} 


}
