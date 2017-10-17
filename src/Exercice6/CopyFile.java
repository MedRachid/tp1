package Exercice6;
import java.io.*;
import java.util.Scanner;

public class CopyFile {

    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le chemin du fichier à copier : ");
        String str = sc.nextLine();
        System.out.println("Saisir le chemin du fichier destinataire : ");
        String chem = sc.nextLine();

        try {
            in = new FileInputStream(str);
            out = new FileOutputStream(chem,true);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}