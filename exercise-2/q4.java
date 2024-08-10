import java.util.Scanner;

public class q4 {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter a no. for which table is to be printed");
 int n = sc.nextInt();
 
    for(int i = 10 ; i >= 1 ; i-- ){
         System.out.println(n +" x "+ i +" = " + n*i);
    }

sc.close();
 }   
}
