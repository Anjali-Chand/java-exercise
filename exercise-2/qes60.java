import java.util.Scanner;
public class qes60 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        //1st method
            int gcd = 0;
            for(int i=1; i<=n1 ;i++ ){
                if(n1%i==0 && n2%i==0){
                    gcd = i;
                }
            }
            System.out.println("GCD of the two numbers are: "+gcd);


        //2nd method
           
        sc.close();
    }
}
