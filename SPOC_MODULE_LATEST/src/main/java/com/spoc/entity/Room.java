package com.spoc.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="room")
public class Room {
		@Id
		private int roomId;
		private int roomNumber;
		private boolean roomStatus;
		public Room(int roomId, int roomNumber, boolean roomStatus) {
			super();
			this.roomId = roomId;
			this.roomNumber = roomNumber;
			this.roomStatus = roomStatus;
		}
		public int getRoomId() {
			return roomId;
		}
		public void setRoomId(int roomId) {
			this.roomId = roomId;
		}
		public int getRoomNumber() {
			return roomNumber;
		}
		public void setRoomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}
		public boolean isRoomStatus() {
			return roomStatus;
		}
		public void setRoomStatus(boolean roomStatus) {
			this.roomStatus = roomStatus;
		}
		
		
		
	
}
