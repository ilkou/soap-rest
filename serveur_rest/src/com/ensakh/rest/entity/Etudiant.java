package com.ensakh.rest.entity;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "etudiant")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etudiant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String cne;
	String nom;
	String prenom;
	Integer age;
	String addresse;
	String ville;
	Integer code_postal;
	String pays;	
	String photo;
	String sexe;
	
	public Etudiant(String cne, String nom, String prenom, Integer age, String addresse, String ville,
			Integer code_postal, String pays, String photo, String sexe) {
		super();
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.addresse = addresse;
		this.ville = ville;
		this.code_postal = code_postal;
		this.pays = pays;
		this.photo = photo;
		this.sexe = sexe;
	}
	
	public Etudiant() {
		super();
	}

	public String getCne() {
		return cne;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public Integer getAge() {
		return age;
	}

	public String getAddresse() {
		return this.addresse;
	}
	
	public String getVille() {
		return ville;
	}
	
	public Integer getCode_postal() {
		return code_postal;
	}

	public String getPays() {
		return pays;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public String getSexe() {
		return sexe;
	}
	

	@Override
	public String toString() {
		return "Etudiant [cne=" + cne + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", addresse="
				+ addresse + ", ville=" + ville + ", code_postal=" + code_postal + ", pays=" + pays + ", photo=" + photo
				+ ", sexe=" + sexe + "]";
	}

	

}