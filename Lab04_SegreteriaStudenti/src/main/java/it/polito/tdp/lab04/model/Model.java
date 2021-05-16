package it.polito.tdp.lab04.model;

import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

public class Model {
	
	private StudenteDAO studenteDAO;
	private CorsoDAO corsoDAO;
	
	public Model() {
		this.studenteDAO = new StudenteDAO();
		this.corsoDAO = new CorsoDAO();
	}
	
	public List<Corso> getTuttiICorsi() {
		return corsoDAO.getTuttiICorsi();
	}
	
	public Studente getInfoStudente(Integer matricola) {
		return studenteDAO.getInfoStudente(matricola);
	}
	
	public List<Studente> getStudentiIscrittoalCorso(Corso corso) {
		return corsoDAO.getStudentiIscrittiAlCorso(corso);
	}
	
	public List<Corso> getCorsiDatoStudente(Integer matricola) {
		return studenteDAO.getCorsiDatoStudente(matricola);
	}
}
