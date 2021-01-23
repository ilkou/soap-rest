package com.ensakh.tpsoap;

import java.sql.SQLException;

import javax.xml.ws.Endpoint;

import com.ensakh.tpsoap.metiers.EnseignantSoap;
import com.ensakh.tpsoap.metiers.ModuleSoap;

public class Server {

	public static void main(String[] args) throws SQLException {
		String address = "http://localhost:9997/enseignant";
		EnseignantSoap enseignantSoap = new EnseignantSoap();
		ModuleSoap moduleSoap = new ModuleSoap();
//		Endpoint.publish("http://localhost:9998/module", moduleSoap);
		Endpoint.publish("http://localhost:9997/enseignant", enseignantSoap);
		System.out.println("Server is running at " + address);
	}

}