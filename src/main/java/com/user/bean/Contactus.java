package com.user.bean;

public class Contactus {
	
		private int CID;
		private String Name;
		private String Email;
		private String Message;
		private int RID;
		private String Subject;
		
		public Contactus() {
			
		}
		
		public Contactus(int CID,String Name,String Email,String Message, int RID, String Subject) {
			this.CID=CID;
			this.Name=Name;
			this.Email=Email;
			this.Message=Message;
			this.RID=RID;
			this.Subject=Subject;
		}
		
		
		public int getCID() {
			return CID;
		}
		public String getName() {
			return Name;
		}
		public String getEmail() {
			return Email;
		}
		
		public String getMessage() {
			return Message;
		}
		public int getRID() {
			return RID;
		}
		public String getSubject() {
			return Subject;
		}
		public void setCID(int cID) {
			CID = cID;
		}
		public void setName(String name) {
			Name = name;
		}
		public void setEmail(String email) {
			Email = email;
		}
		
		public void setMessage(String message) {
			Message = message;
		}
		public void setRID(int rID) {
			RID = rID;
		}
		public void setSubject(String subject) {
			Subject = subject;
		}

	}


