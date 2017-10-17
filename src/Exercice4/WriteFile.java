package Exercice4;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str, filename = "test.txt";

        PrintWriter outfile = new PrintWriter(new FileWriter(filename),true);

        System.out.println("Saisir le texte ou \"quit\" pour quitter : ");
        str = sc.nextLine();

        while (!str.equals("quit")) {
            outfile.println(str);
            System.out.println("Saisir le texte ou \"quit\" pour quitter : ");
            str = sc.nextLine();
        }

        outfile.close();
    }
}
