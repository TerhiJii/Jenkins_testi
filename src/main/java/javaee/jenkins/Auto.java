package javaee.jenkins;

public class Auto {
	
	private String mark;
	private String model;
	private int topSpeed;
	
	private Moottori engine;
	private Ajaja driver;
	
	public Auto(String merkki, String malli, int maxNop, Moottori moottori, Ajaja kuski ){
		this.mark = merkki;
		this.model = malli;
		this.topSpeed = maxNop;
		this.driver= kuski;
		this.engine = moottori;
		
	}
	

	
	public double laskeNopeus(){
		double rikki = engine.getBrokenCylinders();
		double ehja = engine.getCylinders();
		double kerroin = (ehja-rikki)/ehja;
		return kerroin * topSpeed;

	}
	
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Moottori getEngine() {
		return engine;
	}

	public void setEngine(Moottori engine) {
		this.engine = engine;
	}

	public Ajaja getDriver() {
		return driver;
	}

	public void setDriver(Ajaja driver) {
		this.driver = driver;
}

}
