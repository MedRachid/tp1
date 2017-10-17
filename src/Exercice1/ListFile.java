package Exercice1;
import java.io.File;
import java.util.Scanner;


public class ListFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le chemin du dossier : ");
        String str = sc.nextLine();

        File file = new File(str);
        File [] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }
}
