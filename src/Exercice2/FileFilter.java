package Exercice2;
import java.util.Scanner;
import java.io.File;
import java.io.FilenameFilter;


public class FileFilter {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le chemin du dossier : ");
        String str = sc.nextLine();

        File file = new File(str);
        String[] files = file.list(new FilenameFilter() {


            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
            System.out.println(f);
        }
    }
}
