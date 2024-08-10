import java.util.Scanner;

public class q10 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the alphabet");
       char c = sc.next().charAt(0);

       if(c >= 65 && c <= 90){
        System.out.println("the character is uppercase");
       }
       else if(c >= 97 && c <= 122){
        System.out.println("the character is lowercase");
       }
       else{
        System.out.println("invalid character");
       }
    
       sc.close();
}
}