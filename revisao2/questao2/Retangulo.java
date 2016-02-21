package questao2;

public class Retangulo implements Forma {
	private double base;
	private double altura;
		
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area(){
		return base * altura;
	}
}
