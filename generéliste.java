package projetstage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class generéliste {
	 private static Connection con = dbconnect.connect();
	

	 public String ag(String agence) {
			PreparedStatement ps = null;
			ResultSet rs = null;
		
			try {

				String sql1 = "select * from Agence where branch_code='"+agence+"'";
				
					ps = con.prepareStatement(sql1);
				
					rs = ps.executeQuery(); 
					rs.next();
					String ad=rs.getString("designation");return ad;
					
			}catch(SQLException e1) {
				e1.printStackTrace();
				 System.out.println("ereur1");return null;
				
}	
	 }
	 
	 
	 public String[] lcompte(String agence) {
			PreparedStatement ps = null;
			ResultSet rs = null;
			Utilisateur u = new Utilisateur();
			try {

				String sql1 = "select * from Compte where branch_code='"+agence+"'";
				
					ps = con.prepareStatement(sql1);
				
					rs = ps.executeQuery(); int i=0;
					String data[] = new String[9999];
					while (rs.next()) {
				        String id = rs.getString("Numcompte");
				        
				    
				        data[i] = id ;
				       
				       
				        i++;
				      }
					
			return data;
				} catch (SQLException e1) {
					e1.printStackTrace();
					 System.out.println("ereur1");
					
	}
	 return null;}
	 public String[] lclient(String agence) {
			PreparedStatement ps = null;
			ResultSet rs = null;
			Utilisateur u = new Utilisateur();
			try {

				String sql1 = "select * from Compte where branch_code='"+agence+"'";
				
					ps = con.prepareStatement(sql1);
				
					rs = ps.executeQuery(); int i=0;
					String data[] = new String[9000];
					while (rs.next()) {
				        String id = rs.getString("CIF");
				        
				    
				        data[i] = id ;
				       
				       
				        i++;
				      }
					
			return data;
				} catch (SQLException e1) {
					e1.printStackTrace();
					 System.out.println("ereur1");
					
	}
	 return null;}


	 
}
