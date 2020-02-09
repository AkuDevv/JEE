package Exercice2;

public class ErrConst extends Exception{

	private int nbr;

	public ErrConst(int nbr) {
		this.nbr = nbr;
	}

	public int getNb() {
		return nbr;
	}
}