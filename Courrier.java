package ex2;

public class Courrier {
	protected boolean modeExp;
	protected String adressDest;
	protected final double tarif = 0.5;

	public Courrier(boolean modeExp, String adressDest) {
		this.setModeExp(modeExp);
		this.setAdressDest(adressDest);
	}

	public boolean estValide() {
		if (this.adressDest.length() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public void decrire() {
		System.out.print(this.getClass().getSimpleName() + " mode d expedition = " + this.getModeExp()
				+ ", adresse de destination : " + this.getAdressDest() + ", Le tarif : " + this.affranchir() +"\n");
	}

	public double affranchir() {
		double x;
		if (estValide() == true) {
			if (this.modeExp == true) {
				x= tarif * 2;
			} else {
				x= tarif;
			}
		}
		else {
			x= 0;
		}
		return x;
	}

	public boolean getModeExp() {
		return modeExp;
	}

	public void setModeExp(boolean modeExp) {
		this.modeExp = modeExp;
	}

	public String getAdressDest() {
		return adressDest;
	}

	public void setAdressDest(String adressDest) {
		this.adressDest = adressDest;
	}

}
