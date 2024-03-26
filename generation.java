package projetstage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class generation {
	public void incidentcomplet(incident inc) {
		String[] client=new recupincident().utilisateur(inc.getCIF());
		inc.setAdresse(client[6]);
		inc.setDatenaissance(client[2]);
		inc.setFormejuridique(client[5]);
		inc.setLieux(client[3]);
		inc.setNom(client[0]);
		inc.setPrenom(client[1]);
		inc.setWilaya(client[7]);
		inc.setType(client[4]);
	}

public void fingénération() {
	incident[] inci=new recupincident().recupincidtxt(); 
	int i=0;
for(i=0;i<inci.length;i++) {
		generertext generertext = new generertext();
		generertext.incidentcomplet(inci[i]);}

try {System.out.println(inci[1].getAdresse());
	Date d=new Date();
	
	File f1 = new File("F1.txt");
	BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
	bw.write("<fichier du "+d+" >");
	bw.newLine();
	for(i=0;i<inci.length;i++) {  
		String[] s= new recupincident().recupCompt(inci[i].getCIF(), inci[i].getNumcompte());
		String a1="               ",a2="003",a3="00"+inci[i].getBranch_code(),a4=inci[i].getDate_saisie(),a5=inci[i].getNom();
		int j=0,l;
		String a6=inci[i].getPrenom(),a7=inci[i].getAdresse(),a8=inci[i].getWilaya(),a9=inci[i].getDatenaissance(),a10=inci[i].getLieux();
		String a11=inci[i].getFormejuridique(),a12=inci[i].getCIF(),a13=s[2];
		String a14=inci[i].getNumerocheque(),a15=inci[i].getDate_Emission(),a16=inci[i].getDate_presentation();
		String a17=inci[i].getDate_presentation(),a18="  -  -    ",a19=inci[i].getMontant_cheque(),a20=inci[i].getMontant_disponible(),
				a21=inci[i].getNom_benificiere();
		l=a5.length();
		for(j=l;j<30;j++) {
			a5=a5+" ";
		}
		l=a19.length();
		for(j=l;j<13;j++) {
			a19=a19+" ";
		}
		l=a20.length();
		for(j=l;j<13;j++) {
			a20=a20+" ";
		}
		l=a21.length();
		for(j=l;j<30;j++) {
			a21=a21+" ";
		}
		l=a6.length();
		for(j=l;j<50;j++) {
			a6=a6+" ";
		}
		l=a7.length();
		for(j=l;j<50;j++) {
			a7=a7+" ";
		}
		l=a10.length();
		for(j=l;j<30;j++) {
			a10=a10+" ";
		}
		//S0=serie  S2= cle S1= mona
		bw.write(" "+a1+" "+a2+" "+a3+"10"+a4+""+a5+""+a6+","+a7+""+a8+""+a9+""+a10+""+a11+""+a12+""+a13+""+a14+""+a15+""+a16+""+a17+""+a18+""+a19+""+a20+""+a21+"");
		bw.newLine();
	} inci=new recupincident().recupincidtxtreg();
	int j=0;int l;if(inci!=null) {
	for(i=0;i<inci.length;i++) {
		incidentcomplet(inci[i]);}
		for(i=0;i<inci.length;i++) {  
			String[] s= new recupincident().recupCompt(inci[i].getCIF(), inci[i].getNumcompte());
			String a1="               ",a2="003",a3="00"+inci[i].getBranch_code(),a4=inci[i].getDate_saisie(),a5=inci[i].getNom();
			 j=0;
			 
			String a6=inci[i].getPrenom(),a7=inci[i].getAdresse(),a8=inci[i].getWilaya(),a9=inci[i].getDatenaissance(),a10=inci[i].getLieux();
			String a11=inci[i].getFormejuridique(),a12=inci[i].getCIF(),a13=s[2];
			String a14=inci[i].getNumerocheque(),a15=inci[i].getDate_Emission(),a16=inci[i].getDate_presentation();
			String a17=inci[i].getDate_presentation(),a18=inci[i].getDatereg(),a19=inci[i].getMontant_cheque(),a20=inci[i].getMontant_disponible(),
					a21=inci[i].getNom_benificiere();
			l=a5.length();
			for(j=l;j<30;j++) {
				a5=a5+" ";
			}
			l=a19.length();
			for(j=l;j<13;j++) {
				a19=a19+" ";
			}
			l=a20.length();
			for(j=l;j<13;j++) {
				a20=a20+" ";
			}
			l=a21.length();
			for(j=l;j<30;j++) {
				a21=a21+" ";
			}
			l=a6.length();
			for(j=l;j<50;j++) {
				a6=a6+" ";
			}
			l=a7.length();
			for(j=l;j<50;j++) {
				a7=a7+" ";
			}
			l=a10.length();
			for(j=l;j<30;j++) {
				a10=a10+" ";
			}
			//S0=serie  S2= cle S1= mona
			bw.write(" "+a1+" "+a2+" "+a3+"18"+a4+""+a5+""+a6+","+a7+""+a8+""+a9+""+a10+""+a11+""+a12+""+a13+""+a14+""+a15+""+a16+""+a17+""+a18+""+a19+""+a20+""+a21+"");
			bw.newLine();
		}
}
	bw.close();
}catch(Exception e) {System.out.println("Exception lors de l'ecriture fichier text"+e.toString());}

}
private static Connection con  = dbconnect.connect();
void cnfgenerertxt() {
	this.fingénération();
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	try {

		String sql1 = "update Incident set envoyer='oui' where CONFIRMER ='oui' and envoyer='non' and date_saisie < SYSDATE";
		
		ps = con.prepareStatement(sql1);
		rs = ps.executeQuery();
String sql = "update Incident set envoyer_reg='oui' where regulariser ='oui' and date_saisie < SYSDATE";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
	} catch (SQLException e) {
		System.out.println("Exception In Fun : 'generer text cnf' , Details : " + e);
	}
	
}
}