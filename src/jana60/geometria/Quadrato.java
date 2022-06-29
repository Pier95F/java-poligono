package jana60.geometria;

public class Quadrato implements Poligono {
	
	private double lato;

	public Quadrato(double lato) throws IllegalArgumentException {
		
		if (lato<=0) {
			throw new IllegalArgumentException("I dati devono essere tutti numeri positivi");
		}
		
		this.lato = lato;
	}
	
	@Override
	public double calcolaPerimetro() {
		return lato * 4;
	}
	
	@Override
	public double calcolaArea() {
		return lato * lato;
	}
	
	@Override
	public String toString() {
		return "L'area del quadrato è :" + calcolaArea() + " cm; - il perimetro del quadrato è: " + calcolaPerimetro() + " cm";
	}

}
