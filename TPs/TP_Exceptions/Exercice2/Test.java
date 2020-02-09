package Exercice2;

public class Test {
	public static void main(String[] args) {

		try{
			System.out.println("La Somme est : " + EntNat.somme(42 , 14));
			System.out.println(EntNat.somme(Integer.MAX_VALUE , 200));

		}catch(ErrSom e){

			System.out.println(e.getMessage());

			try{

				System.out.println("La difference est : " + EntNat.difference(45 , 13));
				System.out.println(EntNat.diff(Integer.MAX_VALUE + 9, 3));

			}catch(ErrDiff ee) {

				System.out.println(ee.getMessage());

				try {

					System.out.println("Le produit est : " + EntNat.produit(63 , 12));
					System.out.println(EntNat.prod(Integer.MAX_VALUE +2, 12));
				} catch (ErrProd eee) {

					System.out.println(eee.getMessage());
					
				}
			}
		}
	}
}