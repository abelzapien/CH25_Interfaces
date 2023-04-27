
public class Cuadrado implements Figurona { 
	private String name;
	private double lado;
	public Cuadrado(String name, double lado) {
		this.name = name;
		this.lado = lado;
	}
	
	public double calcularArea() {
		return (Math.pow(getLado(), 2));	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado()*4);
	}// calcularPerimetro

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}
	
	
	
}
