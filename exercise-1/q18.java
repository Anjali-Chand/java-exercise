import java.util.Scanner;

public class q18 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter selling price and cost price");
      int sp=sc.nextInt();
      int cp=sc.nextInt();
      
      if(sp>cp){
        System.out.println("profit is "+(sp-cp));
      }
      if(cp>sp){
        System.out.println("loss is "+(cp-sp));
      }
      else{
       System.out.println("neither profit nor loss ");
      }
 
      sc.close();
    }
}
