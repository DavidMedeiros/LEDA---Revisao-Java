package questao2;

public class TestaForma {
	
	private static Forma forma;
	
	public static void main(String[] args) {
		forma = new Triangulo(2,2);
		System.out.println(forma.area());
		forma = new Quadrado(2);
		System.out.println(forma.area());
		forma = new Circulo(2);
		System.out.println(forma.area());
		forma = new Retangulo(2,3);
		System.out.println(forma.area());
	}

	
}
