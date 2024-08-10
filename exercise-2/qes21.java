
public class qes21 {
    public static void main(String args[]){
        int i=0;int sum=0;
        System.out.println("all no.s between 100 and 200 which are divisible by 9 are : ");
      for(i=100;i<=200;i++){
        if(i % 9 == 0){
            System.out.print(i+" ");
            sum = sum + i;
        }
      }
      System.out.println();
      System.out.println("sum of all integers between 100 and 200 which are divisible by 9 is "+sum);
                    
}
}
