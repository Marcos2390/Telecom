package principal;

public class Celular extends Oferta {

	private String Marca;
	private String Modelo;
	private char color;
	private int InternMemory;
	private int RAM;
	private boolean banda5g;

	public Celular(int id, double price, boolean aplicaPromo, String Marca, String Modelo, char color, int InternMemory,
			int RAM, boolean banda5g) {
		super(id, price, aplicaPromo);
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.color = color;
		this.InternMemory = InternMemory;
		this.RAM = RAM;
		this.banda5g = banda5g;

	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public int getInternMemory() {
		return InternMemory;
	}

	public void setInternMemory(int InternMemory) {
		this.InternMemory = InternMemory;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int RAM) {
		this.RAM = RAM;
	}

	public boolean getBanda5g() {
		return banda5g;
	}

	public void setBanda5g(boolean banda5g) {
		this.banda5g = banda5g;
	}

	@Override
	public String mostrarInfo() {
		return super.mostrarInfo() +
				"Marca: " + getMarca() + "\n" +
				"Modelo: " + getModelo() + "\n" +
				"Color: " + getColor() + "\n" +
				"Memoria Interna: " + getInternMemory() + " GB\n" +
				"RAM: " + getRAM() + " GB\n" +
				"Banda 5G: " + (getBanda5g() ? "Sí" : "No") + "\n";
	}
}

/*
 * @Override //Nota: Este método sobreescribe (override) el método mostrarInfo
 * de la superclase Oferta
 * public String mostrarInfo() {
 * return super.mostrarInfo() + "La marca es " + getMarca () + " modelo " +
 * getModelo() + " color  "+ getColor() + " con una memoria de" +
 * getInternMemory() + " tiene una memoria de " + getRAM() +
 * " y un plan de banda " + getBanda5g(); //Completar (Incluir atributos de
 * Celular y llamar al método mostrarInfo de la superclase)
 * }
 * 
 * }/*
 */