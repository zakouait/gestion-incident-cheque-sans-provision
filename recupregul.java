package projetstage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class recupregul {
	private static Connection con = dbconnect.connect();
	
	public int taille(String ag) {PreparedStatement ps = null;
	ResultSet rs = null;
		try {

			String sql1 = "select DISTINCT date_saisie from Incident where regulariser='non' and branch_code='"+ag+"'";
			
				ps = con.prepareStatement(sql1);
			
				rs = ps.executeQuery();
			int count=0;
			while(rs.next()) {
				count++;
			}

			return count;
			
		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'recuperer taille date' , Details : " + e);return 0;
		}}
		public Date[] date(String ag) {PreparedStatement ps = null;
		ResultSet rs = null;
			try {

				String sql1 = "select DISTINCT date_saisie from Incident where regulariser='non' and branch_code='"+ag+"'";
				
					ps = con.prepareStatement(sql1);
				
					rs = ps.executeQuery();
				Date[] count=new Date[this.taille(ag)];
						int i=0;
				while(rs.next()) {
					count[i]=rs.getDate("date_saisie");
					i++;
				}

				return count;
				
			} catch (SQLException e) {
				System.out.println("Exception In Fun : 'recuperer  date' , Details : " + e);return null;
			}
		}
			public incident[] Incident(String ag,String d) {PreparedStatement ps = null;
			ResultSet rs = null;
				try {

					String sql1 = "select * from Incident where regulariser='non' and branch_code='"+ag+"' and date_saisie='"+d+"'";
					
						ps = con.prepareStatement(sql1);
					
						rs = ps.executeQuery();
					incident[] inci=new incident[this.tailleinc(ag,d)];
							int i=0;
					while(rs.next()) {
						inci[i]=new incident(rs.getString("numerocheque"),rs.getString("CIF"),rs.getString("Numcompte"),rs.getString("branch_code"),String.valueOf(rs.getDate("Date_Emission")),
								String.valueOf(rs.getDate("Date_presentation")),
								String.valueOf(rs.getDate("date_saisie")),
								String.valueOf(rs.getDate("date_limit_regul")),
								String.valueOf(rs.getInt("montant_cheque")),
								String.valueOf(rs.getInt("montant_disponible")),
								rs.getString("nom_benificiere"));
						i++;
					}

					return inci;
					
				} catch (SQLException e) {
					System.out.println("Exception In Fun : 'recuperer  date' , Details : " + e);return null;
				}
				
	}	public int tailleag() {PreparedStatement ps = null;
	ResultSet rs = null;
	try {

		String sql1 = "select DISTINCT branch_code FROM Incident where regulariser='non'";
		
			ps = con.prepareStatement(sql1);
		
			rs = ps.executeQuery();
		int count=0;
		while(rs.next()) {
			count++;
		}

		return count;
		
	} catch (SQLException e) {
		System.out.println("Exception In Fun : 'recuperer nb agence' , Details : " + e);return 0;
	}
}
	public String[] agence() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {

			String sql1 = "select DISTINCT branch_code FROM Incident where regulariser='non'";
			
				ps = con.prepareStatement(sql1);
			
				rs = ps.executeQuery();
			String[] count=new String[this.tailleag()];
			int i=0;
			while(rs.next()) {
				count[i]=rs.getString("branch_code");
				i++;
			}

			return count;
			
		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'recuperer nb agence' , Details : " + e);return null;
		}
	}
	
	public int tailleinc(String ag,String d) {PreparedStatement ps = null;
	ResultSet rs = null;
	try {

		String sql1 = "select * from Incident where regulariser='non' and branch_code='"+ag+"' and date_saisie=to_date('"+d+"','dd-mm-yyyy')";
		
			ps = con.prepareStatement(sql1);
		
			rs = ps.executeQuery();
		int count=0;
		while(rs.next()) {
			count++;
		}

		return count;
		
	} catch (SQLException e) {
		System.out.println("Exception In Fun : 'recuperer nb agence' , Details : " + e);return 0;
	}
}
}
