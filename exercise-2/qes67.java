public class qes67 {
//     The given String is: Tutorials Point Welcomes You!!
// Number of words in the given string: 4
//agar string me=" ",""dono ka matlab same h? 

public static void main(String args[]){
         int count=1;
          String str="tutorial point welcomes you";
          char ch=' ';//yahan string kyu nhi use kar sakte
          for(int i=0; i<str.length();i++){
                     if(str.charAt(i) == ch){
                            count=count + 1;
                     }
          }
          System.out.println("Number of words in the given string is "+count);

    }
}
// String msg = "Tutorials Point Welcomes You!!";
//       System.out.println("The given String is: " + msg);
//       // initial count of the words
//       int total = 1;
//       // for loop to count the number of words
//       for (int i = 0; i < msg.length(); i++) {
//          // checking if current character is space or not
//          if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' ')) {
//             total++; // incrementing the word count 
//          }
//       }