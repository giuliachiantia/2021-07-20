package it.polito.tdp.yelp.model;

public class Event implements Comparable <Event>{
	public enum EventType{
		DA_INTERVISTARE, 
		FERIE,
	}
	private int giorno;
	private EventType type;
	private User intervistato;
	private Giornalista giornalista;
	public Event(int giorno, EventType type, User intervistato, Giornalista giornalista) {
		super();
		this.type=type;
		this.giorno = giorno;
		this.intervistato = intervistato;
		this.giornalista = giornalista;
	}
	
	public EventType getType() {
		return type;
	}
	
	public int getGiorno() {
		return giorno;
	}
	public User getIntervistato() {
		return intervistato;
	}
	public Giornalista getGiornalista() {
		return giornalista;
	}
	@Override
	public int compareTo(Event o) {
		return this.giorno-o.giorno; //se o viene dopo da valore pos
	}
	
	
}
