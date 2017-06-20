package com.main;

import java.sql.SQLException;

public class HomePage {

		public String clickSignUp(){
			System.out.println("HomePage - click signUp");
			return "Success";
		}
		

		public String clickLogin() {// throws SQLException{
			//boolean isValidCredentials= false;
			
			//if(isValidCredentials){
			System.out.println("HomePage - click Login");
			return "Success";
			/*}
			else{
				
				System.out.println("Credentials are not verified in Database");
				throw new SQLException();
			}*/

		}
		

		public String doASearch(){
			System.out.println("HomePage - search something");
			return "Success";

		}
		
		
}
