package com.ibm.travelplanner.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer extends BaseEntity {
	
		private static final long serialVersionUID = 1L;
		private String firstName;
	    private long lastName;
	    private String email;
	    private Integer phone;
	    

	
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public long getLastName() {
			return lastName;
		}
		public void setLastName(long lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Integer getPhone() {
			return phone;
		}
		public void setPhone(Integer phone) {
			this.phone = phone;
		}
		
	   

}
