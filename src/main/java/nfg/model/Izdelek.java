package nfg.model;

public class Izdelek {
	private long id;
	private String ime;
	private double cena;
	private String sifra;
	
	public Izdelek() {}
	public Izdelek(long id, String ime, double cena, String sifra) {
		this.id = id;
		this.ime = ime;
		this.cena = cena;
		this.sifra = sifra;
	}
	
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
}