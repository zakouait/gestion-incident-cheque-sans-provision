package projetstage;
public class Utilisateur {
private String user,mdp,role;

public Utilisateur(String user, String mdp, String role) {
	super();
	this.user = user;
	this.mdp = mdp;
	this.role = role;
}

public Utilisateur() {
	super();
	user=null;
	mdp=null;
	role=null;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

public String get() {
	return role;
}

public void setrole(String role) {
	this.role = role;
}


}
