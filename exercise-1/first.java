import java.util.*;
public class first{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        if(n1>n2){
            System.out.println("n1 is maximum");
        }else if(n1<n2){
            System.out.println("n2 is maximum");
        }
        else{
            System.out.println("both are equal");
        }
        sc.close();
    }
}