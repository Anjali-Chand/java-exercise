import java.util.Scanner;

public class q14 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("input the angles of a triangle in degrees ");
      int angle1=sc.nextInt();
      int angle2=sc.nextInt();
      int angle3=sc.nextInt();
      
      if(angle1 + angle2 + angle3 == 180){
        System.out.println("this is a valid trianlge");
      }else{
       System.out.println("invalid triangle");
      }

      sc.close();
    }
}
