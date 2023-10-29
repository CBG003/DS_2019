package ex2;

public class Lettre extends Courrier {
	private double poids;
	private String format;

	public Lettre(boolean modeExp, String adressDest, double poids, String format) {
		super(modeExp, adressDest);
		this.setPoids(poids);
		this.setFormat(format);
	}

	@Override
	public void decrire() {
		super.decrire();
		System.out.print(", poids=" + this.getPoids() + " grammes " + ", format= " + this.getFormat() + "\n");
	}

	@Override
	public double affranchir() {
		double x = 0;
		if (this.format.toUpperCase() == "A3") {
			x = 3.50 + 0.5 * this.poids * 0.001;
		} 
		else {
			if (this.format.toUpperCase() == "A4") {
				x = 2.50 + 0.5 * this.poids * 0.001;
			}
		}
		if(super.modeExp == true) {
			return x*2;
	}
		else {
			return x;
		}
		}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		if (format.toUpperCase() == "A3" || format.toUpperCase() == "A4") {
			this.format = format.toUpperCase();
		}

	}

}
