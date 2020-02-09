package Exercice2;

public class EntNat{

	public static int somme(int nb1,int nb2) throws ErrSom {
		if (nb1 + nb2 < 0) throw new ErrSom("L'Addition est superieure a MAX_VALUE");
		return nb1 + nb2;
	}

	public static int difference(int nb1,int nb2) throws ErrDiff {
		if (nb1 - nb2 < 0) throw new ErrDiff("La difference est superieure a MAX_VALUE");
		return nb1 - nb2;
	}

	public static int produit(int nb1,int nb2) throws ErrProd {
		if (nb1 * nb2 < 0) throw new ErrProd("Le produit est superieure a MAX_VALUE");
		return nb1 * nb2;
	}
}