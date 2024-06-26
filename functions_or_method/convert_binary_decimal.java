package functions_or_method;
import java.util.*;

public class convert_binary_decimal {
    public static void bitodecNum(int binum) {
        int myNum = binum; // We Use myNum variable for OutPut
    int pow = 0;
    int decNum = 0;
    while(binum > 0){
        int lastdigit = binum  % 10;
        decNum = decNum +(lastdigit * (int)Math.pow(2,pow));
        pow++;
        binum = binum / 10 ;

    }
    System.out.println("Decimal number of " + myNum + " is : " + decNum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any binary number");
        int binum = sc.nextInt();
        bitodecNum(binum);
        sc.close();
        
    }

    
}
