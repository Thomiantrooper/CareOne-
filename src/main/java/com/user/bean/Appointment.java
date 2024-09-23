package com.user.bean;

import java.time.LocalDate;

public class Appointment {

		private int AID;
		private String Name;
		private String Email;
		private String Phone;
		private String Message;
		private int RID;
		private LocalDate Date;
		private String Department;
		
		
		public Appointment() {
			
		}
		public Appointment( int AID,String Name,String Email,String Phone,String Message,int RID,LocalDate Date,String Department) {
			
			this.AID=AID;
			this.Name=Name;
			this.Email=Email;
			this.Phone=Phone;
			this.Message=Message;
			this.RID=RID;
			this.Date=Date;
			this.Department=Department;
			
		}
		
		public int getAID() {
			return AID;
		}
		public void setAID(int aID) {
			AID = aID;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPhone() {
			return Phone;
		}
		public void setPhone(String phone) {
			Phone = phone;
		}
		public String getMessage() {
			return Message;
		}
		public void setMessage(String message) {
			Message = message;
		}
		public int getRID() {
			return RID;
		}
		public void setRID(int rID) {
			RID = rID;
		}
		public LocalDate getDate() {
			return Date;
		}
		public void setDate(LocalDate date) {
			Date = date;
		}
		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}
		
	
}
