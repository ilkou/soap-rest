package com.ensakh.rest.controller;

import com.ensakh.rest.entity.Etudiant;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ensakh.rest.dao.EtudiantDao;

@Path("/etudiants")
public class EtudiantController {
	EtudiantDao etudiantDao = new EtudiantDao();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Etudiant> getCountries() throws SQLException
	{
		return etudiantDao.getAllEtudiants();
	}
	
	@GET
    @Path("/{cne}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Etudiant getCountryById(@PathParam("cne") String cne) throws SQLException
	{
		return etudiantDao.getEtudiant(cne);
	}
	
	@POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Etudiant addCountry(Etudiant etudiant) throws SQLException
	{
		return etudiantDao.enregistrement(etudiant);
	}
	
	
	@PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Etudiant updateCountry(Etudiant e) throws SQLException
	{
		return etudiantDao.modification(e);
	}
	
	@DELETE
    @Path("/{cne}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteCountry(@PathParam("cne") String cne) throws SQLException
	{
		etudiantDao.suppression(cne);
	}
}
