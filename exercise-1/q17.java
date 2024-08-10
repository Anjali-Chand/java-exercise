import java.util.Scanner;

public class q17 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("input coefficients of the quadratic equation a,b,c : ");
      double a=sc.nextInt();
      double b=sc.nextInt();
      double c=sc.nextInt();
      
      if( Math.sqrt(Math.pow(b,2) - (4 * a * c )) >= 0 ){
      double root1= -b + Math.sqrt(Math.pow(b,2) - (4 * a * c ));
      double root2= -b - Math.sqrt(Math.pow(b,2) - (4 * a * c ));
      System.out.println("roots of quadratic equations are " + root1 + " " + root2);
      }
      else{
        System.out.println("roots are imaginary");
      }
    
      sc.close();
    }
}
