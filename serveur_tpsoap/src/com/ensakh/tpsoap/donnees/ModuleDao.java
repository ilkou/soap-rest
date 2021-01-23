package com.ensakh.tpsoap.donnees;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.ensakh.tpsoap.entity.Enseignant;
import com.ensakh.tpsoap.entity.Module;

public class ModuleDao {

	private Connection connectionDb;
	
	public ModuleDao() {
		
		connectionDb = ConnectionDb.getConnection();
		// TODO Auto-generated constructor stub
	}
	public void enregistrement(Module e) throws SQLException
	{
		String sql = "INSERT INTO module (id_module, nom, description, cni) "
				+ "VALUES (?, ?, ?, ?)";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		statement.setInt(1, e.getId());
		statement.setString(2, e.getNom());
		statement.setString(3, e.getDesc());
		statement.setString(4, e.getCni());
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}
	
	public void modification(Module e) throws SQLException
	{
		String sql = "update enseignant set id_module = ?, nom = ?, description = ?, cni = ?";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		
		statement.setInt(1, e.getId());
		statement.setString(2, e.getNom());
		statement.setString(3, e.getDesc());
		statement.setString(4, e.getCni());
		
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}
	
	
	public void suppression(Integer id) throws SQLException
	{
		String sql = "delete from module where id_module = ?";

		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		statement.setInt(1, id);
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}

	
}
