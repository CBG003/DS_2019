package ex2;

public class BoiteCourrier {
	private Courrier[] t;

	public BoiteCourrier(int n) {
		this.setT(new Courrier[n]);
	}
	

	public double affranchir() {
		double x = 0;
		for (int i = 0; i < getT().length; i++) {
			x = getT()[i].affranchir();
		}
		return x;
	}

	public int courriersInvalides() {
		int nb = 0 ;
		for(int i = 0 ; i<getT().length ; i++) {
			if(getT()[i].estValide() == false) {
				nb++;
			}
		}
		return nb;
		}
	
	public void afficher() {
		for(int i = 0 ; i<getT().length ; i++) {
			getT()[i].decrire();
		}
	}


	public Courrier[] getT() {
		return t;
	}


	public void setT(Courrier[] t) {
		this.t = t;
	}

}
