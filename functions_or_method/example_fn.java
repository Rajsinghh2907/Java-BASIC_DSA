package functions_or_method;
import java.util.*;
public class example_fn {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any binary number ");
        int binum = sc.nextInt();
        int pow = 0;
        int decnum = 0;
        while(binum >0){
           int lastdigit = binum %10;
        
            decnum = decnum + (lastdigit  * (int)Math.pow(2,pow));
            pow++;
            lastdigit = binum / 10;
        }
        System.out.println(decnum);
       sc.close();
    }
    
}
