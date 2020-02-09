package Exercice1;

public class EntNat {

	private int nbr;

	public EntNat(int nbr) throws ErrConst{
		if ( nbr < 0 ) throw new ErrConst("Ce nombre n'est pas un entier naturel!!");
		this.nbr=nbr;
	}
	public int getN() {
		return nbr;
	}
}
