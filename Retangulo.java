package projeto_objeto_geometrico_mab;

public class Retangulo extends ObjetoGeometrico {
	private double comprimento;
	private double altura;
	Retangulo(double c, double a) {
		comprimento = c;
		altura = a;
	}
	public double getArea ( ) {
		area = comprimento * altura;
		return area;
	}
	public double getPerimetro ( ) {
		perimetro = comprimento + altura;
		return perimetro;
	}
}
