public class qes40 {
    public static void main(String args[]){
        
        int fact =1;int sum =0;
        for(int j=1;j<=100000;j++){ 
          int temp = j; int n=j;                 
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
          System.out.print(temp+" ");
        }
        sum=0;
       }
    }
}
