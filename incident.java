package projetstage;

import java.util.Date;

public class incident {
private String numerocheque="",CIF,Numcompte,branch_code;
private String Date_Emission,Date_presentation,date_saisie,date_limit_regul;
private String montant_cheque,montant_disponible;
private String nom_benificiere="";
private String nom="",prenom="",datenaissance="",lieux="",type="",adresse="",wilaya="",formejuridique="";
private String datereg;
public String getDatereg() {
	return datereg;
}
public void setDatereg(String datereg) {
	this.datereg = datereg;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getDatenaissance() {
	return datenaissance;
}
public void setDatenaissance(String datenaissance) {
	this.datenaissance = datenaissance;
}
public String getLieux() {
	return lieux;
}
public void setLieux(String lieux) {
	this.lieux = lieux;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getWilaya() {
	return wilaya;
}
public void setWilaya(String wilaya) {
	this.wilaya = wilaya;
}
public String getFormejuridique() {
	return formejuridique;
}
public void setFormejuridique(String formejuridique) {
	this.formejuridique = formejuridique;
}
public String getNumerocheque() {
	return numerocheque;
}
public void setNumerocheque(String numerocheque) {
	this.numerocheque = numerocheque;
}
public String getCIF() {
	return CIF;
}
public void setCIF(String cIF) {
	CIF = cIF;
}
public String getNumcompte() {
	return Numcompte;
}
public void setNumcompte(String numcompte) {
	Numcompte = numcompte;
}
public String getBranch_code() {
	return branch_code;
}
public void setBranch_code(String branch_code) {
	this.branch_code = branch_code;
}
public String getDate_Emission() {
	return Date_Emission;
}
public void setDate_Emission(String date_Emission) {
	Date_Emission = date_Emission;
}
public String getDate_presentation() {
	return Date_presentation;
}
public void setDate_presentation(String date_presentation) {
	Date_presentation = date_presentation;
}
public String getDate_saisie() {
	return date_saisie;
}
public void setDate_saisie(String date_saisie) {
	this.date_saisie = date_saisie;
}
public String getDate_limit_regul() {
	return date_limit_regul;
}
public void setDate_limit_regul(String date_limit_regul) {
	this.date_limit_regul = date_limit_regul;
}
public String getMontant_cheque() {
	return montant_cheque;
}
public void setMontant_cheque(String montant_cheque) {
	this.montant_cheque = montant_cheque;
}
public String getMontant_disponible() {
	return montant_disponible;
}
public void setMontant_disponible(String montant_disponible) {
	this.montant_disponible = montant_disponible;
}
public String getNom_benificiere() {
	return nom_benificiere;
}
public void setNom_benificiere(String nom_benificiere) {
	this.nom_benificiere = nom_benificiere;
}
public incident(String numerocheque, String cIF, String numcompte, String branch_code, String date_Emission,
		String date_presentation, String date_saisie, String date_limit_regul, String montant_cheque, String montant_disponible,
		String nom_benificiere) {
	super();
	this.numerocheque = numerocheque;
	CIF = cIF;
	Numcompte = numcompte;
	this.branch_code = branch_code;
	Date_Emission = date_Emission;
	Date_presentation = date_presentation;
	this.date_saisie = date_saisie;
	this.date_limit_regul = date_limit_regul;
	this.montant_cheque = montant_cheque;
	this.montant_disponible = montant_disponible;
	this.nom_benificiere = nom_benificiere;
	
	}
public incident() {
	numerocheque="";CIF="";Numcompte="";branch_code="";
 Date_Emission="";Date_presentation="";date_saisie="";date_limit_regul="";
	 montant_cheque="";montant_disponible="";
  nom_benificiere="";
	nom="";prenom="";datenaissance="";lieux="";type="";adresse="";wilaya="";formejuridique="";
}

}
