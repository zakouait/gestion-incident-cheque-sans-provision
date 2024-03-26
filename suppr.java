package projetstage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class suppr {
	private static Connection con = dbconnect.connect();

	public boolean chequeExiste(String nbcheque, String cif,String numerocompte,String numeroagence) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Utilisateur u = new Utilisateur();
		try {

			String sql1 = "select * from incident where numerocheque='" +nbcheque+ "' and CIF ='"+cif+"' and Numcompte='"+numerocompte+"' and  branch_code='"+numeroagence+"'";
			
				ps = con.prepareStatement(sql1);
			
				rs = ps.executeQuery();boolean userNameExiste = rs.next();
		return userNameExiste;
			} catch (SQLException e1) {
				e1.printStackTrace();
				 System.out.println("ereur1");
			}return false;	
}
	public boolean supr(String nbcheque, String cif,String numerocompte,String numeroagence) {
		if(chequeExiste(nbcheque,cif,numerocompte,numeroagence)==false) {return false;
			
		}else {
			try {

				String sql1 = "DELETE from incident where numerocheque='" +nbcheque+ "' and CIF = '"+cif+"' and Numcompte='"+numerocompte+"' and  branch_code='"+numeroagence+"'";
				
					PreparedStatement ps = con.prepareStatement(sql1);
				
					ResultSet rs = ps.executeQuery();}catch (SQLException e1) {
						e1.printStackTrace(); System.out.println("ereur2");return false;
					}return true;
		}
			
		
		
	}
	public incident Créearchivesupr(String nbcheque, String cif,String numerocompte,String numeroagence) {
		if(chequeExiste(nbcheque,cif,numerocompte,numeroagence)==false) {return null;
			
		}else {
			try {

				String sql1 = "select * from incident where numerocheque='" +nbcheque+ "' and CIF = '"+cif+"' and Numcompte='"+numerocompte+"' and  branch_code='"+numeroagence+"'";
				
					PreparedStatement ps = con.prepareStatement(sql1);
				
					ResultSet rs = ps.executeQuery();
			rs.next();
			incident inci=new incident();
			inci=new incident(rs.getString("numerocheque"),rs.getString("CIF"),rs.getString("Numcompte"),rs.getString("branch_code"),String.valueOf(rs.getDate("Date_Emission")),
					String.valueOf(rs.getDate("Date_presentation")),
					String.valueOf(rs.getDate("date_saisie")),
					String.valueOf(rs.getDate("date_limit_regul")),
					String.valueOf(rs.getInt("montant_cheque")),
					String.valueOf(rs.getInt("montant_disponible")),
					rs.getString("nom_benificiere"));
			Date d=new Date();
			
			DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			String	da=format.format(d);
			inci.setDatereg(da);
			return inci;
			}catch (SQLException e1) {
						e1.printStackTrace(); System.out.println("ereur2");return null;
					}
		}
			
		
		
	}

	public boolean archive (String nbcheque, String cif,String numerocompte,String numeroagence) {
		
		try {
String demission;
incident inci=this.Créearchivesupr(nbcheque,cif,numerocompte,numeroagence);
Date da=new Date();
DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
demission=format.format(da);
			String sql1 = "insert into archive values ( '"+inci.getNumerocheque()+ "','"+inci.getCIF()+"','"+inci.getNumcompte()+"','"+inci.getBranch_code()+"','"+inci.getMontant_cheque()+"','"+inci.getMontant_disponible()+"','"+inci.getNom_benificiere()+"',to_date('"+demission+"','dd-mm-yyyy') )";
			
				PreparedStatement ps = con.prepareStatement(sql1);
			
				ResultSet rs = ps.executeQuery();
	this.supr(inci.getNumerocheque(), inci.getCIF(), inci.getNumcompte(), inci.getBranch_code());return true;
	}catch (SQLException e1) {
		e1.printStackTrace(); System.out.println("ereur archivage");return false;
	}
}

	public boolean regularise(String nbcheque, String cif,String numerocompte,String numeroagence) {
		if(chequeExiste(nbcheque,cif,numerocompte,numeroagence)==false) {return false;
			
		}else {
			try {

				String sql1 = "update incident set regulariser='oui',DATEREG=SYSDATE where numerocheque='" +nbcheque+ "' and CIF = '"+cif+"' and Numcompte='"+numerocompte+"' and  branch_code='"+numeroagence+"' ";
		
					PreparedStatement ps = con.prepareStatement(sql1);
				
					ResultSet rs = ps.executeQuery();
						
			}catch (SQLException e1) {
						e1.printStackTrace(); System.out.println("ereur2");return false;
					}return true;
		}
			
		
		
	}}