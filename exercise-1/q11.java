import java.util.Scanner;

public class q11 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter week number");
       int wn = sc.nextInt();
        
        switch(wn){
            case 1:
            System.out.println("weekday is sunday");
            break;
            case 2:
            System.out.println("weekday is monday");
            break;
            case 3:
            System.out.println("weekday is tuesday");
            break;
            case 4:
            System.out.println("weekday is wednesday");
            break;
            case 5:
            System.out.println("weekday is thrusday");
            break;
            case 6:
            System.out.println("weekday is friday");
            break;
            case 7:
            System.out.println("weekday is saturday");
            break;
            default:
            System.out.println("invalid no.");
        }
       
    
       sc.close();
}
}