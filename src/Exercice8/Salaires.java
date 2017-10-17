package Exercice8;

import Exercice8.domain.*;
import Exercice8.service.Personnel;
import java.util.Scanner;

public class Salaires {
    public static void main(String[] args) {

        Personnel p = new Personnel();

        p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));

        p.afficherSalaires();
        System.out.println(String.format(
                "Le salaire moyen dans l'entreprise est de %.2f francs.\n",
                p.salaireMoyen()
        ));
        System.out.println("s/S: Permets de saisir les paramètres d'un nouvel employé");
        System.out.println("c/C: Permet de lancer le calcul de salaire");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

            if (str.equals("S") || str.equals("s")) {
                System.out.println("Veuillez saisir le type d'employé");
                System.out.println("(1) Manutentionnaire a Risque");
                System.out.println("(2) Manutentionnaire");
                System.out.println("(3) Representant");
                System.out.println("(4) Technicien a Risque");
                System.out.println("(5) Technicien");
                System.out.println("(6) Vendeur");
                Scanner numb = new Scanner(System.in);
                int choice = numb.nextInt();

                 switch(choice)
                {
                    case 1:
                        System.out.println("x");
                        break;

                }

            } else if (str.equals("C") || str.equals("c")) {
                System.out.println("courscou");
                p.afficherSalaires();
            } else {

            }

        }
}


