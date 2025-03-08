public class qes50 {
    public static void main(String args[]){
        String str = "abba";String s="";

        for(int i=str.length()-1 ; i >= 0 ; i--) {
               s = s + str.charAt(i) ;
        }

         if(str.equals(s)){
            System.out.println("string is pallindrome");
         }else{
            System.out.println("string is not pallindrome");
         }
                   
    }
}
