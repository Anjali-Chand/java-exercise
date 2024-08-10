import java.util.*;
public class fourth{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        
        if(n%5 == 0 && n%11 == 0){
            System.out.println("no. is divisible by 5 and 11");
        }else{
            System.out.println("no. is not divisible by 5 and 11");
        }
    

        sc.close();
    }
}