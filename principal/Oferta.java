package principal;

public class Oferta {

	private int id;
	private double price;
	private boolean aplicaPromo;
	private String precioFinal;

	public Oferta(int id, double price, boolean aplicaPromo) {
		this.id = id;
		this.price = price;
		this.aplicaPromo = aplicaPromo;
	}

	public double getPrecioFinal() {
		if (aplicaPromo) {
			return price * 0.8; // (20% de descuento) si aplica
		} else {
			return price;
		}
	}

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setPrice(double setPrice) {
		this.price = price;
	}
	// (Modificacion)

	public double getPrice() {
		return price;
	}

	public void setAplicaPromo(boolean aplicaPromo) {
		this.aplicaPromo = aplicaPromo;
	}

	public boolean getAplicaPromo() {
		return aplicaPromo;

	}

	public String mostrarInfo() {
		return "ID: " + getId() + "\n" +
				"Precio base: $" + getPrice() + "\n" +
				"Aplica promoción: " + (getAplicaPromo() ? "Sí (20% desc.)" : "No") + "\n" + // (Agrega salto de linea)
				"Precio final: $" + getPrecioFinal() + "\n";
	}
}

/*
 * public String mostrarInfo() {
 * return
 * " ID:" + getId() +
 * " su precio es de: " + getPrice() + " " +
 * "este equipo esta incluido en la promocion?  " + (getAplicaPromo() ? "(si) ":
 * "(no) ");
 * }
 * 
 * }/*
 */