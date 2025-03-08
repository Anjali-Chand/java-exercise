public class qes43 {
    public static void main(String args[]){
        
        int sum = 0;
        for(int i =1; i<1000 ; i++){
            int temp = i;
            while(i>0){
                int r=i%10;
                sum = sum + (r*r*r);
                 i=i/10;
            }
            if(sum == temp){
                System.out.print(temp+" ");
            }
            sum=0;
            i = temp;
        }
    }
}
