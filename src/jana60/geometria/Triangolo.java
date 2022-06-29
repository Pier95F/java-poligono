package jana60.geometria;

public class Triangolo implements Poligono{

		private double lato1, lato2, lato3;
		private double base, altezza;
		public Triangolo(double lato1, double lato2, double lato3, double base, double altezza) throws IllegalArgumentException{
			
			if (lato1 <=0 || lato2 <=0 || lato3 <=0 || base <=0 || altezza<=0) {
				throw new IllegalArgumentException("I dati devono essere tutti numeri positivi");
			}
			
			this.lato1 = lato1;
			this.lato2 = lato2;
			this.lato3 = lato3;
			this.base = base;
			this.altezza = altezza;
		}
		
		@Override
		public double calcolaPerimetro() {
			return lato1 + lato2 + lato3;
		}
		
		@Override
		public double calcolaArea() {
			return (base*altezza)/2;
		}
		
		@Override
		public String toString() {
			return "L'area del triangolo è: " + calcolaArea() + " cm; - il perimetro del triangolo è: " + calcolaPerimetro() + " cm";
		}
		
}
