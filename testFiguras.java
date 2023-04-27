public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("pizzaMacro", 30.0);
		Rectangulo r1 = new Rectangulo("MesaPingPong", 40.0, 70.0);
		Rombo ro1 = new Rombo("RombosMan",30.0,30.0,30.0);
		Romboide rom1 = new Romboide("Rombonoide", 40.0, 70.0);
		Trapecio tr1 = new Trapecio("TrapecioEstrella",40.0,70.0,40.0,25.0,
													25.0, 70.0, 45.0);
		
		DameLaFigura.imprimirCalculo(t1);
		DameLaFigura.imprimirCalculo(t2);
		DameLaFigura.imprimirCalculo(c1);
		DameLaFigura.imprimirCalculo(r1);
		DameLaFigura.imprimirCalculo(ro1);
		DameLaFigura.imprimirCalculo(rom1);
		DameLaFigura.imprimirCalculo(tr1);
		
	}//main

	
//	public static void imprimirCalculo(Triangulo t) {
//		System.out.println(t);
//		System.out.println("+========================================");
//		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
//				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
//		System.out.println("+========================================");
//	}//imprimirCalculo
}