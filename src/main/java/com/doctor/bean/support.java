package com.doctor.bean;


public class support {

		private int SID;
		private String Name;
		private String Email;
		private String Message;
		private int DID;
		private String Subject;
		
		
		
		
		public support( int SID,String Name,String Email,String Message,int DID, String Subject) {
			
			this.SID=SID;
			this.Name=Name;
			this.Email=Email;
			this.Message=Message;
			this.DID=DID;
			this.Subject=Subject;
			
		}
		
		public int getSID() {
			return SID;
		}
		public void setSID(int sID) {
			SID = sID;
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
		public String getMessage() {
			return Message;
		}
		public void setMessage(String message) {
			Message = message;
		}
		public int getDID() {
			return DID;
		}
		public void setDID(int dID) {
			DID = dID;
		}	
		public String getSubject() {
			return Subject;
		}
		public void setSubject(String subject) {
			Subject= subject;
		}
		
}
