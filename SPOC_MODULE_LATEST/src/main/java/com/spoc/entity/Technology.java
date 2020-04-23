package com.spoc.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="technology")
public class Technology {
	
	@Id
	private int technology_id;
	private String technology_name;

	public Technology() {
	
	}

	public int getTechnology_id() {
		return technology_id;
	}

	public void setTechnology_id(int technology_id) {
		this.technology_id = technology_id;
	}

	public String getTechnology_name() {
		return technology_name;
	}

	public void setTechnology_name(String technology_name) {
		this.technology_name = technology_name;
	}

	public Technology(int technology_id, String technology_name) {
		super();
		this.technology_id = technology_id;
		this.technology_name = technology_name;
	}

}

