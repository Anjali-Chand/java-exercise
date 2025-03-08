public class qes23 {
    public static void main(String args[]){
        int sum = 0;
        int num=1221;
        int temp = num;
        while(num>0){
        int r = num % 10;
        sum = sum*10 + r ;
        num = num / 10; 

        }
if(sum == temp){
    System.out.println("no. is pallindrome");
}else{
    System.out.println("no. is not pallindrome");
}

    }
}
