package hr.fer.oop.z2;

public class Fraction {
	private final int brojnik;
	private final int nazivnik;
	
	public int getBrojnik() {
		return brojnik;
	}
	public int getNazivnik() {
		return nazivnik;
	}
	public Fraction(int brojnik,int nazivnik) {
		this.brojnik=brojnik;
		this.nazivnik=nazivnik;
	}
	public Fraction add(Fraction fraction) {
		int gcd= this.gcd(fraction.nazivnik, nazivnik);
		Fraction result= new Fraction(brojnik*(fraction.getNazivnik()/gcd)+fraction.getBrojnik()*(nazivnik/gcd),nazivnik*fraction.getNazivnik()/gcd);
		return result;
	}
	public Fraction subtract(Fraction fraction) {
		int gcd= this.gcd(fraction.nazivnik, nazivnik);
		Fraction result= new Fraction(brojnik*(fraction.getNazivnik()/gcd)-fraction.getBrojnik()*(nazivnik/gcd),nazivnik*fraction.getNazivnik()/gcd);
		return result;
	}
	public Fraction multiply(Fraction fraction) {
		Fraction result = new Fraction(brojnik*fraction.getBrojnik(),nazivnik*fraction.getNazivnik());
		return result;
	}
	public Fraction divide(Fraction fraction) {
		Fraction result = new Fraction(brojnik*fraction.getNazivnik(),nazivnik*fraction.getBrojnik());
		return result;
	}
	public Fraction invert() {
		Fraction result = new Fraction(nazivnik,brojnik);
		return result;
	}
	public Fraction negate() {
		Fraction result = new Fraction(-brojnik,nazivnik);
		return result;
	}
	private static int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
	}
	@Override
	public String toString() {
		return Integer.toString(brojnik)+" / "+nazivnik;
	}

}
