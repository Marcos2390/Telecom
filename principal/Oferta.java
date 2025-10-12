package principal;

public class Oferta {

	private int id;
	private double price;
	private boolean aplicaPromo;

	
	public Oferta(int id, double price, boolean aplicaPromo) {
		this.id= id;
		this.price= price;
		this.aplicaPromo= aplicaPromo;
	}

	
	public void setId(int id) {
		this.id=id;
		
	}

	
	public int getId() {
		return id;
	}

	
	public void setPrice ( double setPrice) {
		this.price = price;
	}

	
	public double  getPrice() {
		return price;
	}

	
	public void setAplicaPromo( boolean aplicaPromo) {
		this.aplicaPromo=aplicaPromo;
	}

	
	public boolean getAplicaPromo() {
		return aplicaPromo;

	}

	
	public String mostrarInfo() {
		return
		" ID:" + getId() +
		" su precio es de: " + getPrice() +  " " +
        "este equipo esta incluido en la promocion?  " + (getAplicaPromo() ? "(si) ": "(no) ");
	}

}