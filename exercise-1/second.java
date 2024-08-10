import java.util.*;
public class second{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the three no.s : ");
      
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();

      if(n1!=n2 || n2!=n3 || n3!=n1){

       if(n1>=n2 && n1>=n3)
       System.out.println("n1 is maximum"); 
       else if(n2>=n1 && n2>=n3)
       System.out.println("n2 is maximum"); 
       else 
       System.out.println("n3 is maximum"); 

    }
    else{
        System.out.println("All three no.s are equal");
    }

      sc.close();
    }
}