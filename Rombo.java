
public class Rombo implements Figurona  {
	private String name;
	private double lado;
	private double diagMe;
	private double diagMa;
	public Rombo(String name, double lado, double diagMe, double diagMa) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagMe = diagMe;
		this.diagMa = diagMa;
	}
	
	public double calcularArea() {
		return ((getDiagMa()*getDiagMe())/2);	
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
	public double getDiagMe() {
		return diagMe;
	}
	public void setDiagMe(double diagMe) {
		this.diagMe = diagMe;
	}
	public double getDiagMa() {
		return diagMa;
	}
	public void setDiagMa(double diagMa) {
		this.diagMa = diagMa;
	}
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagMe=" + diagMe + ", diagMa=" + diagMa + "]";
	}
	
	
	
}
