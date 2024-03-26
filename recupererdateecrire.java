package projetstage;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class recupererdateecrire {
	public static void main(String[] args) {
		
	Date d=new Date();	DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	String	da=format.format(d);
	java.time.Instant l;
	
//	java.util.Date date = new java.util.Date();
	//d.equals(date);
	/* Calendar calendar = Calendar.getInstance();
	
	Date dbefore= new Date(d.getTime()-7*24*3600*10);
;
	System.out.println(da);
		incident[] inci=new recupincident().recupincidtxt(da); 
		int i=0;
	for(i=0;i<inci.length;i++) {
			generertext generertext = new generertext();
			generertext.incidentcomplet(inci[i]);}
	
	try {
		
		File f = new File("F.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write("<fichier du "+d+" >");
		bw.newLine();
		for(i=0;i<inci.length;i++) {
			bw.write("<incident "+i+">");
			bw.newLine();
			bw.write("<chéque numero="+inci[i].getNumerocheque()+">");
			bw.newLine();
			bw.write("<CIF="+inci[i].getCIF()+">");
			bw.newLine();
			bw.write("<Compte="+inci[i].getNumcompte()+">");
			bw.newLine();
			bw.write("<Agence ="+inci[i].getBranch_code()+">");
			bw.newLine();
			bw.write("<nom ="+inci[i].getNom()+">");
			bw.newLine();
			bw.write("<Prenom ="+inci[i].getPrenom()+">");
			bw.newLine();
			bw.write("<Adresse ="+inci[i].getAdresse()+">");
			bw.newLine();
			bw.write("<type ="+inci[i].getType()+">");
			bw.newLine();
			bw.write("<forme  juridique ="+inci[i].getFormejuridique()+">");
			bw.newLine();
			bw.write("<Wilaya ="+inci[i].getWilaya()+">");
			bw.newLine();
			bw.write("<Date naissance="+inci[i].getDatenaissance()+">");
			bw.newLine();
			bw.write("<lieux de naissance="+inci[i].getLieux()+">");
			bw.newLine();
			bw.write("<="+inci[i]+">");
			bw.newLine();
			bw.write("<montant cheque ="+inci[i].getMontant_cheque()+">");
			bw.newLine();
			bw.write("<montant disponible="+inci[i].getMontant_disponible()+">");
			bw.newLine();
			bw.write("<date emission="+inci[i].getDate_Emission()+">");
			bw.newLine();
			bw.write("<date presentation="+inci[i].getDate_presentation()+">");
			bw.newLine();
			bw.write("<date saisie="+inci[i].getDate_saisie()+">");
			bw.newLine();
			bw.write("<date limite regulation="+inci[i].getDate_limit_regul()+">");
			bw.newLine();
			bw.write("<nom beneficiaire="+inci[i].getNom_benificiere()+">");
			bw.newLine();
			bw.write("</incident"+i+">");
			bw.newLine();
			
			
			
			
		}bw.close();
		
	}catch(Exception e) {System.out.println("Exception lors de l'ecriture fichier text"+e.toString());}

	
	*/int i=new recupregul().tailleag();
	System.out.print(i);
	String ii[]=new recupregul().agence();
	
	}
	
	
	
}
