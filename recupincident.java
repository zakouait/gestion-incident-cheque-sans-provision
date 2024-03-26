package projetstage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class recupincident {
	private static Connection con = dbconnect.connect();
public int taille() {PreparedStatement ps = null;
ResultSet rs = null;
	try {

		String sql1 = "select * from Incident where confirmer ='non' and regulariser='non'";
		
			ps = con.prepareStatement(sql1);
		
			rs = ps.executeQuery();
		int count=0;
		while(rs.next()) {
			count++;
		}
if(count==0) {
	System.out.println("no solution");
}
		return count;
		
	} catch (SQLException e) {
		System.out.println("Exception In Fun : 'recuperer taille incident' , Details : " + e);return 0;
	}
}
	public incident[] recupincid() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {

			String sql1 = "select * from Incident where CONFIRMER ='non' and regulariser='non'";
			
			ps = con.prepareStatement(sql1);
		
			rs = ps.executeQuery();
			incident[] inci=new incident[this.taille()];
			int i=0;
			while(rs.next()) {
			
				inci[i]=new incident(rs.getString("numerocheque"),rs.getString("CIF"),rs.getString("Numcompte"),rs.getString("branch_code"),String.valueOf(rs.getDate("Date_Emission")),
						String.valueOf(rs.getDate("Date_presentation")),
						String.valueOf(rs.getDate("date_saisie")),
						String.valueOf(rs.getDate("date_limit_regul")),
						String.valueOf(rs.getInt("montant_cheque")),
						String.valueOf(rs.getInt("montant_disponible")),
						rs.getString("nom_benificiere"));
			i++;}return inci;
			
		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'recuperer incident' , Details : " + e);return null;
		}
		

	}
	public boolean conf(String nbcheque, String cif,String numerocompte,String numeroagence) {
		boolean bool=new suppr().chequeExiste(nbcheque, cif, numerocompte, numeroagence);
		if(bool=true) 
			{  PreparedStatement ps = null ;
		     ResultSet rs = null ;
		     try {
		    	
		    	 String sql1="update incident SET CONFIRMER = 'oui'  where  numerocheque='"+nbcheque+"'and CIF='"+cif+"' and Numcompte='"+numerocompte+"' and branch_code='"+numeroagence+"'  ";
		    	
		              ps = con.prepareStatement(sql1);
		  	
		              rs = ps.executeQuery();
		              return true;
		  	
		     }catch (SQLException e)
		     {	 donnéenonconforme no=new donnéenonconforme();
			 no.frmErreurDonneNon.setVisible(true);
		         System.out.println("Exception In Fun : 'conf' , Details : "+e); return false;
		     }
				 
			}
			
		
		return false;
	}
	
	public incident[] recupincidtext() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {

			String sql1 = "select * from Incident where confirmer ='oui' and regulariser='non' and ENVOYER='non' and date_limit_regul < SYSDATE";
			
			ps = con.prepareStatement(sql1);
		
			rs = ps.executeQuery();
			incident[] inci=new incident[this.taille()];
			int i=0;
			while(rs.next()) {
			
				inci[i]=new incident(rs.getString("numerocheque"),rs.getString("CIF"),rs.getString("Numcompte"),rs.getString("branch_code"),String.valueOf(rs.getDate("Date_Emission")),
						String.valueOf(rs.getDate("Date_presentation")),
						String.valueOf(rs.getDate("date_saisie")),
						String.valueOf(rs.getDate("date_limit_regul")),
						String.valueOf(rs.getInt("montant_cheque")),
						String.valueOf(rs.getInt("montant_disponible")),
						rs.getString("nom_benificiere"));
			i++;}return inci;
			
		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'recuperer incident' , Details : " + e);return null;
		}
		

	}
	public String[] utilisateur(String CIF){
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {String[] Data= new String [8];
			String sql1 = "select * from Client where CIF ='"+CIF+"' ";
			ps = con.prepareStatement(sql1);
			rs = ps.executeQuery();
			rs.next();
			Data[0]=rs.getString("nom");
					Data[1]=rs.getString("prenom");
					Data[2]=String.valueOf(rs.getDate("datenaisance"));
					Data[3]=rs.getString("lieux_naissance");
					Data[4]=rs.getString("type_client");
					Data[5]=rs.getString("forme_juridique");
							Data[6]=rs.getString("adresse");
									Data[7]=rs.getString("willaya");
			return Data;
		}catch(SQLException e) {
			System.out.println("Exception In Fun : 'recuperer client' , Details : " + e);return null;
		}
	}
	public incident[] recupincidtxt() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {

			String sql1 = "select * from Incident where CONFIRMER ='oui' and envoyer='non' and regulariser='non' and date_saisie < SYSDATE";
			
			ps = con.prepareStatement(sql1);
		
			rs = ps.executeQuery();
			incident[] inci=new incident[this.tailletxt()];
			int i=0;
			while(rs.next()) {
			
				inci[i]=new incident(rs.getString("numerocheque"),rs.getString("CIF"),rs.getString("Numcompte"),rs.getString("branch_code"),String.valueOf(rs.getDate("Date_Emission")),
						String.valueOf(rs.getDate("Date_presentation")),
						String.valueOf(rs.getDate("date_saisie")),
						String.valueOf(rs.getDate("date_limit_regul")),
						String.valueOf(rs.getInt("montant_cheque")),
						String.valueOf(rs.getInt("montant_disponible")),
						rs.getString("nom_benificiere"));
			i++;}return inci;
			
		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'recuperer incident' , Details : " + e);return null;
		}
		

	}
	
	
	
	
	
	public int tailletxt() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {

			String sql1 = "select * from Incident where CONFIRMER ='oui' and envoyer='non' and regulariser='non' and date_saisie < SYSDATE";
			
			ps = con.prepareStatement(sql1);
		
			rs = ps.executeQuery();
			
			int i=0;
			while(rs.next()) {
			
			
			i++;}return i;
			
		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'recuperer incident' , Details : " + e);return 0;
		}
		

	}
	public int tailletxtreg( ) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {

			String sql1 = "select * from Incident where envoyer='oui' and envoyer_reg='non' and regulariser='oui' and date_limit_regul < SYSDATE";
			
			ps = con.prepareStatement(sql1);
		
			rs = ps.executeQuery();
			
			int i=0;
			while(rs.next()) {
			
			
			i++;}return i;
			
		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'recuperer incident' , Details : " + e);return 0;
		}
		

	}
	public String[] recupCompt(String cif,String comp)
	{PreparedStatement ps = null;
	ResultSet rs = null;
	
		
		try {

			String sql1 = "select * from Compte where CIF='"+cif+"'and Numcompte='"+comp+"'";
			
			ps = con.prepareStatement(sql1);
		
			rs = ps.executeQuery();
			
			String[] i=new String[3];
			if(rs.next()) {
			i[0]=rs.getString("Serie");
					i[1]=rs.getString("monna");
					i[2]=rs.getString("cle");

			}
return i;
			
		} catch (SQLException e) {
			System.out.println("Exception In Fun : 'recuperer compte' , Details : " + e);return null;
		}
			
	}
	


public incident[] recupincidtxtreg() {
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	try {

		String sql1 = "select * from Incident where envoyer='oui' and envoyer_reg='non' and regulariser='oui' and date_limit_regul < SYSDATE";
		
		ps = con.prepareStatement(sql1);
	
		rs = ps.executeQuery();
		incident[] inci=new incident[this.tailletxtreg()];
		int i=0;
		if(this.tailletxtreg()==0) {System.out.println("null");
			return null;
		}else {
		while(rs.next()) {
			inci[i]=new incident(rs.getString("numerocheque"),rs.getString("CIF"),rs.getString("Numcompte"),rs.getString("branch_code"),String.valueOf(rs.getDate("Date_Emission")),
					String.valueOf(rs.getDate("Date_presentation")),
					String.valueOf(rs.getDate("date_saisie")),
					String.valueOf(rs.getDate("date_limit_regul")),
					String.valueOf(rs.getInt("montant_cheque")),
					String.valueOf(rs.getInt("montant_disponible")),
					rs.getString("nom_benificiere"));
			inci[i].setDatereg(String.valueOf(rs.getDate("datereg")));
		i++;}return inci;
		}
	} catch (SQLException e) {
		System.out.println("Exception In Fun : 'recuperer incident regul' , Details : " + e);return null;
	}
	
}
}

