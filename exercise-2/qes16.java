import java.util.Scanner;

public class qes16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);      
        System.out.println("enter a no. : ");
        int n = sc.nextInt();
        int i=0;int sum = 0;
        while(n>0){
        i = n % 10 ;
        sum = sum + i;
        n = n/10;
        }
        System.out.println("sum is : "+sum);
        sc.close();
}
}