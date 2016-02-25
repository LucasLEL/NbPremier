package test_nb;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nb_double;
		int nb;int premier = 0;int again;

		do {
			// On demande à l'utilisateur de rentrer un nombre
			System.out.println("Entrez un nombre entier");

			// Enregistrement du nombre comme un double
			nb_double = sc.nextFloat();

			// Cast du nombre en int
			nb = (int) nb_double;

			// Verification que le double et le int soit indentique (un nb
			// premier peut etre qu'un entier
			while (nb != nb_double) {
				System.out.println("Entrez un nombre entier");
				nb_double = sc.nextFloat();
				nb = (int) nb_double;
			}
			
			//Il n'existe pas de nb entier inférieur à 2
			if (nb < 2) {
				System.out.println(nb + " n'est pas un nombre premier ...");
			} else {
				//Verifie si le nombre n'est divisible que par lui meme ou par 1 
				for (int i = 2; i <= nb - 1; i++) {
					if (nb % i == 0) {
						premier = 1;
					}
				}
				//Affichage du resultat en console
				if (premier == 0) {
					System.out.println(nb + " est un nombre premier !");
				} else {
					System.out.println(nb + " n'est pas un nombre premier ...");
				}
			}
			//Demande de nouveau nombre
			System.out.println("\nNouveau nombre ? 1 = oui / 2 = non");
			again = sc.nextInt();
			//Verification que l'utilisation à saisir 1 ou 2 et rien d'autre
			while (again != 1 && again != 2) {
				System.out.println("Saisie incorrecte ...");
				System.out.println("\nNouveau nombre ? 1 = oui / 2 = non");
				again = sc.nextInt();
			}
		//Execution tant que l'utilisateur n'a pas saisi 2 à la question "Nouveau nombre ?"
		} while (again == 1);
	}
}
