
import java.util.Scanner;

public class qes65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max. no.:");
        int max = sc.nextInt();
        
        int min = 0;

        int randomNum = min + (int)(Math.random()*((max - min )+ 1));
        System.out.println("Random number is: "+randomNum);
        sc.close();
    }
}
