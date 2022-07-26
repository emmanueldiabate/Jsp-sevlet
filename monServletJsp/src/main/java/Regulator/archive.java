package Regulator;

public class archive {
	String nom;
	String prenom;
	String pseudo;
	String email;
	String password;
	String passconfirm;
public archive(
		String nom,
		String prenom,
		String pseudo,
		String email,
		String password,
		String passconfirm
		) {
	this.nom = nom;
	this.prenom = prenom;
	this.pseudo = pseudo;
	this.email = email;
	this.password= password;
	this.passconfirm = passconfirm;
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
public String getPseudo() {
	return pseudo;
}
public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPassconfirm() {
	return passconfirm;
}
public void setPassconfirm(String passconfirm) {
	this.passconfirm = passconfirm;
}

	

}
