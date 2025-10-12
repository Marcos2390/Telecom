package principal;


public class InternetPlano extends Oferta {

	private String Plano;
	private int TopeGB;
	private boolean TelFijo;

	
	public InternetPlano(int id, double price, boolean aplicaPromo, String Plano, int TopeGB, boolean TelFijo) {
		super(id,price,aplicaPromo);
		this.Plano=Plano;
		this.TopeGB=TopeGB;
		this.TelFijo=TelFijo;

	}

	
	public String getPlano() {
		return Plano;
	}

	
	public void setPlano(String Plano) {
		this.Plano=Plano;
	}

	
	public int getTopeGB() {
		return TopeGB;
	}

	
	public void setTopeGB(int TopeGB) {
		this.TopeGB=TopeGB;
	}

	
	public boolean getTelFijo() {
		return TelFijo;
	}

	
	public void setTelFijo(boolean TelFijo) {
		this.TelFijo=TelFijo;
	}

	
	@Override
	public String mostrarInfo() {
		return super.mostrarInfo() + "plano"  + getPlano() + " con un plan de: " + getTopeGB() + " " +  " y tel fijo " + (getTelFijo ()? "si" : "no ");
		
	}

}