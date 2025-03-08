public class qes39 {
    public static void main(String args[]){
        
      int n=145;int fact =1;int sum =0;int temp = n; 
      while(n > 0){
        int r = n%10;
        for(int i=1; i<=r ;i++){
            fact = fact * i;
        }
        sum = sum + fact;
        n=n/10;
        fact = 1;
      }   
      if(sum == temp){
        System.out.println("no. is a strong number");
      }else{
        System.out.println("not a strong number");
      }

    }
}
