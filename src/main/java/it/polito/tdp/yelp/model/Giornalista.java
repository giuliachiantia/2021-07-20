package it.polito.tdp.yelp.model;

public class Giornalista {
	
	private int id;
	private int numIntervistati;
	
	public Giornalista(int id) {
		super();
		this.id = id;
		this.numIntervistati=0;
		
	}

	public int getId() {
		return id;
	}

	public int getNumeroIntervistati() {
		return numIntervistati;
	}
	
	public void incrementaNumeroIntervistati() {
		this.numIntervistati++;
	}
	
	

}
