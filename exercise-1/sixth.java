import java.util.*;
public class sixth{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year: ");
        int year=sc.nextInt();
        
    if(year % 100 != 0 ){
        if(year % 4 == 0){
            System.out.println("The year entered is a leap year");
        }
        else{
            System.out.println("The entered year is not leap year");
        }
    }
    else
    {
        if(year % 400 ==0){
           System.out.println("The entered year is leap year");
        }else{
            System.out.println("The entered year is not leap year");
        }
    }

        sc.close();
    }
}