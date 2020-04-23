package com.spoc.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="room")
public class Room {
		@Id
		private int room_id;
		private boolean room_status;
		private String date;
		public Room() {
			
		}
		public Room(int room_id, boolean room_status, String date) {
			super();
			this.room_id = room_id;
			this.room_status = room_status;
			this.date = date;
		}
		public int getRoom_id() {
			return room_id;
		}
		public void setRoom_id(int room_id) {
			this.room_id = room_id;
		}
		public boolean isRoom_status() {
			return room_status;
		}
		public void setRoom_status(boolean room_status) {
			this.room_status = room_status;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		
		
		
}
