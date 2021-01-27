package com.ensakh.soap;

import java.sql.SQLException;

import javax.xml.ws.Endpoint;

import com.ensakh.soap.metiers.enseignant.EnseignantSoap;
import com.ensakh.soap.metiers.module.ModuleSoap;

public class Server {

	public static void main(String[] args) throws SQLException {

		String local = "http://localhost";
		Endpoint.publish(local + ":9998/module", new ModuleSoap());
		Endpoint.publish(local + ":9997/enseignant", new EnseignantSoap());
		System.out.println("Server is running at:");
		System.out.println(local + ":9998/module");
		System.out.println(local + ":9997/enseignant");

	}

}