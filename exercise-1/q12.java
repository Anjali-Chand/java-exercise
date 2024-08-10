import java.util.Scanner;

public class q12 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter week number");
       int mn = sc.nextInt();
        
       if(mn == 1 || mn == 3 || mn == 5 || mn == 7 || mn == 8 || mn == 10 || mn == 12 )
       System.out.println("this month have 31 days");
       else if(mn == 4 || mn == 6 || mn == 9 || mn == 11)
       System.out.println("this month have 30 days");
       else if(mn == 2)
       System.out.println("this month have 28 days");
       else
       System.out.println("invalid month");
    
       sc.close();
}
}
