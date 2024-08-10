import java.util.Scanner;

public class qes17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);      
        System.out.println("enter a positive no. : ");
        int n = sc.nextInt();
        int i=0;int flag = 0;
        
        if(n == 0 || n == 1)
            System.out.println("no. is not prime");
        
        else if(n == 2)
                System.out.println("number is prime");
            
        else{
                for(i=2;i<n;i++){
                    if(n % i == 0 ){
                       flag = 1;
                       break;
                    } 
                  }
                  if(flag == 1){
                     System.out.println("no. is not prime");
                  }else{
                    System.out.println("no. is prime");
                  }

                } 
     sc.close();
}
}