package projetstage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class dbconnect {
 
	public static Connection c = null;
	public static Connection connect() {
         // TODO Auto-generated method stub
  if(c==null) {
  try {
   DriverManager.registerDriver(new OracleDriver());    //This is for loading the odbc driver
   System.out.println("Driver loaded Successfully");  
   c=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","SYSTEM"); //connecting to the database
   System.out.println("Connection Successful");
  } catch (SQLException e) {
   System.out.println("Some problem in connection");
   
   
   // TODO Auto-generated catch block
   e.printStackTrace();
  }}

 return c;}

}