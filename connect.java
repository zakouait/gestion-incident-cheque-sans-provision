package projetstage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connect {
	private static Connection con = dbconnect.connect();

	public Utilisateur UserExiste(String user, String mdp) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Utilisateur u = new Utilisateur();
		try {

			String sql1 = "select * from login where nomutilisateur='" + user + "'";
			
				ps = con.prepareStatement(sql1);
			
				rs = ps.executeQuery();
			

			boolean userNameExiste = rs.next();
			if (userNameExiste == true) {
				if (rs.getString(2).equals(mdp)) {
					String role = rs.getString(3);
					
					return new Utilisateur(user, mdp, role);
				} else {

					mdp_incorect med=new mdp_incorect();
					med.setVisible(true);
					return null;
				}
			} else {
				mdp_incorect med=new mdp_incorect();
				med.setVisible(true);
				return null;
			}

		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'UserExist' , Details : " + e);
		}
		return null;

	}
}
