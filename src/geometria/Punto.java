package geometria;

public class Punto {

	private double x;
	private double y;
	
	public Punto(double equis, double ye) {
		this.x = equis;
		this.y = ye;
	}	

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distanciaHasta(Punto P) {
		return Math.sqrt(Math.pow(this.x - P.x, 2) + Math.pow(this.y - P.y, 2));
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
}
