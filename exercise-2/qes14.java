import java.util.Scanner;

public class qes14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);      
        System.out.println("enter the base no. : ");
        int a = sc.nextInt();
        System.out.println("enter the power : ");
        int b=sc.nextInt();
        
        System.out.println(Math.pow(a,b));
       sc.close();
        }   
}
