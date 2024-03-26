package projetstage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ajoutincident {
	 private static Connection con = dbconnect.connect();
	 public boolean ajout(String ncheque,String cif,String ncommpte,String cagence,String demission,String dsaisie,String dpresentation,String dregul,int mcheque,int mdisponible,String nom_benificiere)
	 {  PreparedStatement ps = null ;
     ResultSet rs = null ;
if(mcheque>mdisponible) {
     try {
    
    	 String sql1="insert into incident values ('"+ncheque+"','"+cif+"','"+ncommpte+"','"+cagence+"',to_date('"+demission+"','dd-mm-yyyy'),to_date('"+dpresentation+"','dd-mm-yyyy'),to_date('"+dsaisie+"','dd-mm-yyyy'),to_date('"+dregul+"','dd-mm-yyyy'),'"+mcheque+"','"+mdisponible+"','"+nom_benificiere+"','non','non','non','','non')";
    	
              ps = con.prepareStatement(sql1);
  	
              rs = ps.executeQuery();
              return true;
  	
     }catch (SQLException e)
     {
    	 donnéenonconforme no=new donnéenonconforme();
    	 no.frmErreurDonneNon.setVisible(true);
         System.out.println("Exception In Fun : 'UserExist' , Details : "+e); return false;
     }}else { donnéenonconforme no=new donnéenonconforme();
	 no.frmErreurDonneNon.setVisible(true);
    	 return false;
     }
		 
	}
	
}
