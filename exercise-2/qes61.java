import java.util.Scanner;
public class qes61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two no.s : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int lcm = (n1>n2)?n1 : n2;

        while(true){
            if(lcm%n1 == 0 && lcm % n2 ==0 ){
                 System.out.println("lcm of the entered no.s is : "+lcm);
                 break;
            }
            lcm++;
        }
    sc.close();
    }
}
