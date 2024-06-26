package STRING;
import java.util.*;

public class Palindrome {
    public static boolean isPalindrome (String str) {
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){  
                return false; //Not a palindrome
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter Any String to check it is Palindrome or not");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        isPalindrome(str);  

        if(isPalindrome(str) == false ){
            System.out.println("it's not palindrome");
        }
        else{
            System.out.println("it is palindrome");
        }
        sc.close();
    }
    
}
