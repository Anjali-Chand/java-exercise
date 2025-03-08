import java.util.Scanner;
public class qes62 {
    public static void main (String args[]){
         Scanner sc =new Scanner(System.in);
         String str = sc.next();

        for(String word : str.split(" ")){

              System.out.println(word);
                           
        }
        sc.close();
    }
}
