package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {
	
	
	public Studente getInfoStudente(Integer matricola) {
		String sql = "SELECT * "
				+ "FROM studente "
				+ "WHERE matricola = ?";
		Studente s = null;
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, matricola);
			
			ResultSet rs = st.executeQuery();
		
			if(rs.next()) {
				s = new Studente(rs.getInt("matricola"), rs.getString("nome"), rs.getString("cognome"), rs.getString("CDS"));
			}

			conn.close();
		
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
		
		return s;
	}
	
	public List<Corso> getCorsiDatoStudente(Integer matricola) {
		List<Corso> corsi = new ArrayList<Corso>();
		
		
		String sql = "SELECT * "
				+ "FROM corso c, iscrizione i "
				+ "WHERE c.codins = i.codins AND i.matricola = ? ";
		
		try {
			Connection conn = ConnectDB.getConnection();
			
			PreparedStatement st = conn.prepareStatement(sql);

			st.setInt(1, matricola);
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				
				Corso s = new Corso(rs.getString("codins"), rs.getString("nome"), rs.getInt("crediti"), rs.getInt("pd"));
				corsi.add(s);
			}
			
			conn.close();
			

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
		
		return corsi;
	}
}

