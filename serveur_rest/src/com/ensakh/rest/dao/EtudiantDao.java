package com.ensakh.rest.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.ensakh.rest.entity.Etudiant;

public class EtudiantDao {

	private Connection connectionDb;
	
	public EtudiantDao() {
		connectionDb = ConnectionDb.getConnection();
	}
	public Etudiant enregistrement(Etudiant e) throws SQLException
	{
		String sql = "INSERT INTO etudiant (cne, nom, prenom, age, adresse, ville, code_postal, pays, photo, sexe) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		statement.setString(1, e.getCne());
		statement.setString(2, e.getNom());
		statement.setString(3, e.getPrenom());
		statement.setInt(4, e.getAge());
		statement.setString(5, e.getAddresse());
		statement.setString(6, e.getVille());
		statement.setInt(7, e.getCode_postal());
		statement.setString(8, e.getPays());
		statement.setString(9, e.getPhoto());
		statement.setString(10, e.getSexe());
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}
		return (e);

	}
	
	public Etudiant modification(Etudiant e) throws SQLException
	{
		String sql = "update etudiant set nom = ?, prenom = ?, age = ?, adresse = ?, ville = ?"
				+ ", code_postal = ?, pays = ?, photo = ?, sexe = ? where cne = ?";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		
		statement.setString(1, e.getNom());
		statement.setString(2, e.getPrenom());
		statement.setInt(3, e.getAge());
		statement.setString(4, e.getAddresse());
		statement.setString(5, e.getVille());
		statement.setInt(6, e.getCode_postal());
		statement.setString(7, e.getPays());
		statement.setString(8, e.getPhoto());
		statement.setString(9, e.getSexe());
		statement.setString(10, e.getCne());
		
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}
		return (e);
	}
	
	
	public void suppression(String cne) throws SQLException
	{
		String sql = "delete from  etudiant  where cne = ?";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		statement.setString(1, cne);
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}
	public List<Etudiant> getAllEtudiants() throws SQLException {
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		String query = "SELECT * FROM etudiant";

		Statement st = (Statement) connectionDb.createStatement();

		ResultSet rs = (ResultSet) st.executeQuery(query);

		while (rs.next()) {
			Etudiant etu = null;
			try {
				etu = new Etudiant(rs.getString("cne"), rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"),
						rs.getString("adresse"), rs.getString("ville"), rs.getInt("code_postal"), rs.getString("pays"),
						rs.getString("photo"), rs.getString("sexe"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			etudiants.add(etu);
		}
		st.close();
		return etudiants;
	}
	public Etudiant getEtudiant(String cne) throws SQLException {
		Etudiant etudiant = null;
		String query = "SELECT * FROM etudiant WHERE cne='" + cne + "'";
		Statement st = (Statement) connectionDb.createStatement();

		ResultSet rs = (ResultSet) st.executeQuery(query);

		while (rs.next()) {
            etudiant = new Etudiant(rs.getString("cne"), rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"),
					rs.getString("adresse"), rs.getString("ville"), rs.getInt("code_postal"), rs.getString("pays"),
					rs.getString("photo"), rs.getString("sexe"));
		}
		System.out.println(etudiant);
		return etudiant;
	}

	
}
