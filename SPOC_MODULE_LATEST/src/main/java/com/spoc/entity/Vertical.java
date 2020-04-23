package com.spoc.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vertical")
public class Vertical {

	@Id
	private int vertical_id;
	private String vertical_name;
	public Vertical() {
		
	}
	public Vertical(int vertical_id, String vertical_name) {
		super();
		this.vertical_id = vertical_id;
		this.vertical_name = vertical_name;
	}
	public int getVertical_id() {
		return vertical_id;
	}
	public void setVertical_id(int vertical_id) {
		this.vertical_id = vertical_id;
	}
	public String getVertical_name() {
		return vertical_name;
	}
	public void setVertical_name(String vertical_name) {
		this.vertical_name = vertical_name;
	}
	
}
