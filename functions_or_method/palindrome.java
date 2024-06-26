package functions_or_method;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n,s=0,c,r;           
        System.out.println("Enter Any Number To find it is is palindrome or not");
        n = sc.nextInt();

        c=n;
        while(n>0){
           r = n%10;
           s = (s*10) + r;
           n = n/10;
        }
        if(c==s){
            System.out.println("Number   is a palindrome Number");
        }
        else{
            System.out.println("not a palindrome number");
        }

        sc.close();

    }
}
    
