package com.javalec.Rjoin;

public class DbActionRjoin {
	
	//field
		private final String url_mysql = RJoinShareV.url_mysql;
		private final String id_mysql = RJoinShareV.id_mysql;
		private final String pw_mysql = RJoinShareV.pw_mysql;
		
		String r_id;
		String r_pw;
		String r_name;
		String r_neighborhood;
		String r_people;
		String r_cartegories;
		String r_location;
		

		public DbActionRjoin(String r_id, String r_pw, String r_name, String r_neighborhood, String r_people,
				String r_cartegories, String r_location) {
			super();
			this.r_id = r_id;
			this.r_pw = r_pw;
			this.r_name = r_name;
			this.r_neighborhood = r_neighborhood;
			this.r_people = r_people;
			this.r_cartegories = r_cartegories;
			this.r_location = r_location;
		}



		//construction
		
		//--------------------------------
		//method
		//--------------------------------
		
		public void IdEnroll() {
	
		}
		

}//---
