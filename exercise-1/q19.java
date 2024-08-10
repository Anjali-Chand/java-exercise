import java.util.Scanner;

public class q19 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the temperature in fahrenheit");
      double fh=sc.nextInt();

      System.out.println("temperature in celsius is "+ ((fh-32)*5/9));

      System.out.println("enter the temperature in celsius");
      double cl=sc.nextInt();
      
      System.out.println("temperature in farhrenheit is "+ ((9*cl)/5 + 32));
      
      
      sc.close();
    }
}
