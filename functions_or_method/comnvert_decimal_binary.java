package functions_or_method;
import java.util.*;

public class comnvert_decimal_binary {
    public static void decimaltobinary(int decinum) {
        int myNum = decinum;
    int pow = 0;
    int biNum = 0;
    while(decinum > 0){
        int remainder = decinum  % 2;
        biNum = biNum +(remainder* (int)Math.pow(10,pow));
        pow++;
        decinum = decinum / 2 ;

    }
    System.out.println("binary number of " + myNum + " is : " + biNum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any decimal number to convert binary number");
        int decinum = sc.nextInt();
        decimaltobinary(decinum);
        sc.close();
        
    }

    
}
