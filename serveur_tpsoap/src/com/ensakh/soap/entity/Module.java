package com.ensakh.soap.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "ModuleObject" )
public class Module {
	@XmlElement
	Integer id;
	@XmlElement
	String nom;
	@XmlElement
	String desc;
	@XmlElement
	String cni;

	
	
	public Module(Integer id, String nom, String desc, String cni) {
		super();
		this.id = id;
		this.nom = nom;
		this.desc = desc;
		this.cni = cni;
	}

	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Integer getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getDesc() {
		return desc;
	}

	public String getCni() {
		return cni;
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", nom=" + nom + ", desc=" + desc + ", cni=" + cni + "]";
	}

}

