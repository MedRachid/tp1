package Exercice7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

public class CopyImage {
    public static void main(String args[]) throws IOException{
        FileOutputStream out = null;
        FileInputStream in = null;
        int cursor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le chemin de l'image à copier : ");
        String str = sc.nextLine();
        System.out.println("Saisir le chemin de la nouvelle image copier: ");
        String chem = sc.nextLine();

        try{
            in = new FileInputStream(str);
            out = new FileOutputStream(chem);
            while((cursor = in.read()) !=-1){
                out.write(cursor);
            }
        }
        finally{
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }
            System.out.println("Read and Write complete");
        }
    }
}

