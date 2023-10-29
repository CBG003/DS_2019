package ex2;

public class Colis extends Courrier {
	private double poids, volume;

	public Colis(boolean modeExp, String adressDest, double poids, double volume) {
		super(modeExp, adressDest);
		this.setPoids(poids);
		this.setVolume(volume);
	}

	@Override
	public void decrire() {
		super.decrire();
		System.out.print(" , son poids : " + this.getPoids() + "(en grammes)" + " ,son volume : " + this.getVolume()
				+ "(en litres)" + "\n");
	}

	@Override
	public double affranchir() {
		double x = 0.25 * this.volume + this.poids * 0.001 * 1.0;
		if (super.modeExp == true) {
			return x * 2;
		} else {
			return x;
		}
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

}
