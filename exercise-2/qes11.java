import java.util.Scanner;

public class qes11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);      
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0; 
           for(int i = 1 ; i <= n ; i++ ){

             if(i % 2 != 0){   
            sum = sum + i;
             }

        }
        System.out.println("the sum of odd no.s is : "+sum);
        sc.close();
        }   
}