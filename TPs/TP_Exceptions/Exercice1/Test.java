package Exercice1;

public class Test {
	public static void main(String[] args) {
		try {
			EntNat nbr1 = new EntNat(4);
			System.out.println("Nombre 1 : " + nbr1.getN());
			EntNat nbr2 = new EntNat(-15);
			System.out.println("Nombre 2 : " + nbr2.getN());

		} catch (ErrConst e) {
			System.out.println(e.getMessage());
		}
	}
}
