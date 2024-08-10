
import java.util.Scanner;
public class q8 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the alphabet");
       char c = sc.next().charAt(0);

       if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c=='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
        System.out.println("the alphabet is a vowel");
       }else{
        System.out.println("the entered alphabet is a consonant");
       }
    
       sc.close();
    }
}
