import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws FileNotFoundException{
        if(args.length<1 || args[0].isEmpty() || args[1].isEmpty()){
            return ;}
        Levenshtein ls = new Levenshtein();
        int row_now=1;
        int min_val=10000;
        int val_now=0;
        int row_min=0;
        File f= new File ("C:\\Users\\Angelika\\Desktop\\lista_imion.txt");
        //File f= new File (args[0]);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()){
           // now=ls.levenshteinDistance( sc.nextLine(), args[1]);
            val_now=ls.levenshteinDistance( sc.nextLine(), "DOMINIKA GUZIK");
            if(val_now<min_val){
                min_val=val_now;
                row_min=row_now;
            }
            if(min_val==0){
                break;
            }
            row_now++;
        }
        System.out.println("Linia: "+row_min);
    }
}

