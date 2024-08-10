import java.util.*;
public class fifth {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. : ");
        int n = sc.nextInt();

        if(n%2 == 0)
            System.out.println("no. is even");
        else
            System.out.println("no. is odd");
        sc.close();
    }
}
