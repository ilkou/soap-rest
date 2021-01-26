package com.ensakh.soap.donnees;

import java.sql.SQLException;

import com.ensakh.soap.entity.Enseignant;
import com.ensakh.soap.entity.Module;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class ModuleDao {

	private Connection connectionDb;
	
	public ModuleDao() {
		
		connectionDb = ConnectionDb.getConnection();
		// TODO Auto-generated constructor stub
	}
	
	public Boolean conditionEstVerifie(Module e) throws SQLException
	{
		int max = 2;
		String sql = "SELECT * from module where cni = '" + e.getCni() + "'";
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		
		Statement st = (Statement) connectionDb.createStatement();
		ResultSet rs = (ResultSet) st.executeQuery(sql);

		while (rs.next()) {
			max--;
		}
		st.close();
		if (max >= 1)
			return true;
		else
			return false;
	}
	
	public void enregistrement(Module e) throws SQLException
	{
		if (!conditionEstVerifie(e))
			throw new SQLException("  un enseignat enseigne au plus deux module !\n");
		
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
		if (!conditionEstVerifie(e))
			throw new SQLException("  un enseignat enseigne au plus deux module !\n");

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
