import java.util.Scanner;

public class qes15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);      
        System.out.println("enter a no. : ");
        int n = sc.nextInt();
        
        while(n>0){
        int rem = n % 10 ;
        System.out.print(rem);
        n = n/10;
        }
        sc.close();
        }   
}