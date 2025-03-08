public class qes44 {
    public static void main(String args[]){
        int n=153;int sum =0;int temp =n;

        while(n>0){
           int r=n%10;
           sum=sum + (r*r*r);
           n=n/10;
        }
        if(sum == temp){
            System.out.println(temp+" is an armstrong number");
        }else{
            System.out.println(temp+" n is not a armstrong number");
        }
    }
}
