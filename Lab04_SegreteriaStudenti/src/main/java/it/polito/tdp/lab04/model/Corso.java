package it.polito.tdp.lab04.model;

public class Corso implements Comparable<Corso>{
	private String codins;
	private String nome;
	private int crediti;
	private int pd;
	
	
	public Corso(String codins, String nome, int crediti, int pd) {
		this.codins = codins;
		this.nome = nome;
		this.crediti = crediti;
		this.pd = pd;
	}
	 
	public String getCodins() {
		return codins;
	}

	public String getNome() {
		return nome;
	}

	public int getCrediti() {
		return crediti;
	}

	public int getPd() {
		return pd;
	}

	public void setCodins(String codins) {
		this.codins = codins;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}

	public void setPd(int pd) {
		this.pd = pd;
	}
	
	
	
	@Override
	public String toString() {
		//return "Corso [nome=" + nome + "]";
		return nome;
	}

	@Override
	public int compareTo(Corso corsoInput) {
		return this.nome.compareTo(corsoInput.nome);
	}
	
}
