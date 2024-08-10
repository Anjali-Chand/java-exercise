import java.util.Scanner;

public class q16 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("input sides of a triangle ");
      int side1=sc.nextInt();
      int side2=sc.nextInt();
      int side3=sc.nextInt();
      

      if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2 ){
      if(side1 == side2 && side2 == side3 && side3 == side1){
        System.out.println("this is a equilateral trianlge");
      }
      else if(side1 != side2 && side2 != side3 && side3 != side1){
        System.out.println("this is a scalene trianlge");
      }
      else{
        System.out.println("this is a isoceles triangle");
      }
    }
      else{
       System.out.println("invalid triangle");
      }
    
      sc.close();
    }
}
