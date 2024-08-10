import java.util.Scanner;

public class qes7 {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("even no. between 1 to 100 are : ");
    for(int i = 1 ; i <= 100 ; i++ ){
        if(i % 2 == 0){
         System.out.print(i+ " ");
    }
 }
sc.close();
 }   
}
