package com.ensakh.tpsoap.metiers;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ensakh.tpsoap.donnees.ModuleDao;
import com.ensakh.tpsoap.entity.Module;

@WebService
public class ModuleSoap {

	ModuleDao moduleDao;

	public ModuleSoap() {
		moduleDao = new ModuleDao();
	}
	
	@WebMethod
	public void enregistrement(Module module) throws SQLException
	{
		moduleDao.enregistrement(module);
	}
	
	
	@WebMethod
	public void modification(Module module) throws SQLException
	{
		moduleDao.modification(module);
	}
	
	
	@WebMethod
	public void suppression(Integer id) throws SQLException
	{
		moduleDao.suppression(id);
	}

}