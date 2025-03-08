public class qes45 {
    public static void main(String args[]){
        int n = 120;
        while(n % 2 == 0){
            System.out.println(2+" ");
            n=n/2;
        }
        for(int i = 3; i<=Math.sqrt(n);i+=2){
             while(n%i == 0){
                System.out.println(i+" ");
                n=n/3;
             }
        }
        if(n>2){
            System.out.println(n);
        }
       
    }
}
