package ex2;

public class Test {

	public static void main(String[] args) {
		Courrier c = new Courrier(false, "");
		Lettre l = new Lettre(false, "bonj", 7.5, "A3");
		Colis s = new Colis(true, "bb", 5, 6);
		BoiteCourrier b = new BoiteCourrier(3);
		b.getT()[0] = c;
		b.getT()[1] = l;
		b.getT()[2] = s;
		b.afficher();
		System.out.print("\n"+b.affranchir()); 
		System.out.print("\n"+b.courriersInvalides()); 

		
		
		
		
		

	}
}
