package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	
	static Connection uniqueConn;
	
	public static Connection getConnection(){
		
		if(uniqueConn ==null){
			
			try{
		    	Class.forName("com.mysql.jdbc.Driver");
			    uniqueConn=DriverManager.getConnection(RunTimeSetting.url+RunTimeSetting.dbName,RunTimeSetting.dbUser,RunTimeSetting.dbPwd);		    	
			    if(uniqueConn == null)
			    	System.out.println("error");
			    
			}
			catch (Exception e) {
			
				e.printStackTrace();
			}
			
			return uniqueConn;
		}
		else{		
			return uniqueConn;	
		}
		
		
		
	}

}
