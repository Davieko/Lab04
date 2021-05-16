package it.polito.tdp.lab04.model;

public class Studente {
	private Integer matricola;
	private String nome;
	private String cognome;
	private String CDS;
	
	public Studente(Integer matricola, String nome, String cognome, String CDS) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.CDS = CDS;
	}

	public Integer getMatricola() {
		return matricola;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCDS() {
		return CDS;
	}

	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setCDS(String cDS) {
		CDS = cDS;
	}
	
	

	
}
