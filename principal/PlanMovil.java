package principal;




public class PlanMovil extends Oferta {

	private String Plan;
	private int VolumenGB;
	private int VolumenMin;
	private int VolumenSMS;

	
	public PlanMovil(int id, double price, boolean aplicaPromo, String Plan, int VolumenGB, int VolumenMin, int VolumenSMS) {
		super(id,price,aplicaPromo);
		this.Plan=Plan;
		this.VolumenGB=VolumenGB;
		this.VolumenMin=VolumenMin;
		this.VolumenSMS=VolumenSMS;
	}

	
	public String getPlan() {
		return Plan;
	}

	
	public void setPlan(String Plan) {
		this.Plan= Plan;
	}

	
	public int getVolumenGB() {
		return VolumenGB;
	}

	
	public void setVolumenGB(int VolumenGB) {
		this.VolumenGB= VolumenGB;
	}

	
	public int getVolumenMin() {
		return VolumenMin;
	}

	
	public void setVolumenMin(int VolumenMin) {
		this.VolumenMin=VolumenMin;
	}

	
	public int getVolumenSMS() {
		return VolumenSMS;
	}

	
	public void setVolumenSMS(int VolumenSMS) {
		this.VolumenSMS = VolumenSMS;
	}

	
	@Override
	public String mostrarInfo() {
		return super.mostrarInfo() + "va con el plan" + getPlan() +
		"tiene un volumen de" + getVolumenGB() + "con" + getVolumenMin() + " y " + getVolumenSMS();

	
}

}