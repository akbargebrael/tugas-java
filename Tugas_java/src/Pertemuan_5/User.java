package Pertemuan_5;

import java.sql.Date;

public class User {
		
		private String username, password;
		private Date createdDate;
		
		
		public User() {
			
		}


		public User(String username, String password, Date createdDate) {
			super();
			this.username = username;
			this.password = password;
			this.createdDate = createdDate;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public Date getCreatedDate() {
			return createdDate;
		}


		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}


		public void setCreatedDate(java.util.Date givenDate) {
			// TODO Auto-generated method stub
			
		}

}
