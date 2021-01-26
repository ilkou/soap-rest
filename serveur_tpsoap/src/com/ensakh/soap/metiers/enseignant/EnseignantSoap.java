package com.ensakh.soap.metiers.enseignant;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ensakh.soap.donnees.EnseignantDao;
import com.ensakh.soap.entity.Enseignant;

@WebService
public class EnseignantSoap {

	EnseignantDao enseignantDao;

	public EnseignantSoap() {
		enseignantDao = new EnseignantDao();
	}
	
	@WebMethod
	public void enregistrement(Enseignant enseignant) throws SQLException
	{
		enseignantDao.enregistrement(enseignant);
	}
	
	
	@WebMethod
	public void modification(Enseignant enseignant) throws SQLException
	{
		enseignantDao.modification(enseignant);
	}
	
	
	@WebMethod
	public void suppression(String cni) throws SQLException
	{
		enseignantDao.suppression(cni);
	}

}

