import java.util.Scanner;

public class q15 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("input the sides of a triangles ");
      int side1=sc.nextInt();
      int side2=sc.nextInt();
      int side3=sc.nextInt();
      
      if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
        System.out.println("this is a valid trianlge");
      }else{
       System.out.println("invalid triangle");
      }

      sc.close();
    }
}
