package jana60.geometria;

public class Rettangolo implements Poligono {

		private double base;
		private double altezza;
		
		
		public Rettangolo(double base, double altezza) throws IllegalArgumentException{
			
			if (base <=0.0 || altezza <=0.0) {
			throw new IllegalArgumentException("I dati devono essere tutti numeri positivi");
		}
			
			this.base = base;
			this.altezza = altezza;
		}
		
		@Override
		public double calcolaPerimetro() {
			return base * 2 + altezza * 2;
		}
		
		@Override
		public double calcolaArea() {
			return base * altezza;			
		}		
		
		@Override
		public String toString() {
			return "L'area del rettangolo è: " + calcolaArea() + " cm; - il perimetro del rettangolo è: " + calcolaPerimetro() + " cm";
		}
}
