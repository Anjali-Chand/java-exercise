import java.util.Scanner;

public class qes19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);      
        System.out.println("enter total number of no.s to be taken");
        int n= sc.nextInt();
        int num;

        for(int i=1;i<=n;i++){
             num = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(num);
        }
        
        
        
        sc.close();
}
}
