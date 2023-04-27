
public class Rectangulo implements Figurona  {
	private String name;
	private double base;
	private double altura;
	public Rectangulo(String name, double base, double altura) {
		this.name = name;
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return (getBase() * getAltura());	
	}//calcularArea
	public double calcularPerimetro() {
		return (getBase()*2 + getAltura()*2);
	}// calcularPerimetro
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	
	

}
