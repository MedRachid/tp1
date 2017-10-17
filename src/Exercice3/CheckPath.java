package Exercice3;
import java.io.File;
import java.util.Scanner;


public class CheckPath {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisir le chemin du dossier : ");
            String str = sc.nextLine();

            File file = new File(str);
            File [] files = file.listFiles();

            if (file.exists() || file.isDirectory()) {
                System.out.println("Exists");
                //Determine si c'est un fichier ou un dossier
                if (file.isFile()){
                    System.out.println("File");
                }
                else{
                    System.out.println("Path");
                }
            }
            else{
                System.out.println("NOT Exists");
                //Ce message s'affiche si le fichier n'existe pas
            }
        }
}
