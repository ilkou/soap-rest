package com.ensakh.soap.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "EnseignantObject" )
public class Enseignant {
	@XmlElement
	String cni;
	@XmlElement
	String nom;
	@XmlElement
	String prenom;
	@XmlElement
	Integer age;
	@XmlElement
	String addresse;
	@XmlElement
	String ville;
	@XmlElement
	String photo;
	@XmlElement
	String sexe;
	
	public Enseignant(String cni, String nom, String prenom, Integer age, String addresse, String ville,
			String photo, String sexe) {
		super();
		this.cni = cni;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.addresse = addresse;
		this.ville = ville;
		this.photo = photo;
		this.sexe = sexe;
	}
	
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCni() {
		return cni;
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
	
	public String getPhoto() {
		return photo;
	}
	
	public String getSexe() {
		return sexe;
	}
	

	@Override
	public String toString() {
		return "Etudiant [cni=" + cni + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", addresse="
				+ addresse + ", ville=" + ville + ", photo=" + photo + ", sexe=" + sexe + "]";
	}

	

}

