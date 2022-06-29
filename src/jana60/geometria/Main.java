package jana60.geometria;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException {
		
	/* Creare una classe Main di test in cui generare delle istanze dei poligoni e testare i metodi di calcolo del perimetro e dell’area. */
		
		// Testo il poligono triangolo
		try {
				Poligono triangolo = new Triangolo(5, 7, 8, 5, 10);
				triangolo.calcolaArea();
				triangolo.calcolaPerimetro();
				System.out.println(triangolo.toString());
				
			} catch (IllegalArgumentException exc) {
			System.out.println(exc.getMessage());
		}
		
		// Testo il poligono quadrato
		try {
			Poligono quadrato = new Quadrato(5);
			quadrato.calcolaArea();
			quadrato.calcolaPerimetro();
			System.out.println(quadrato.toString());
			
			} catch (IllegalArgumentException exc) {
			System.out.println(exc.getMessage());
		}
		
		//Testo il poligono rettangolo
		try {
			Poligono rettangolo = new Rettangolo(5, 7);
			rettangolo.calcolaArea();
			rettangolo.calcolaPerimetro();
			System.out.println(rettangolo.toString());
			
			} catch (IllegalArgumentException exc) {
			System.out.println(exc.getMessage());
	}
		
	}

}
