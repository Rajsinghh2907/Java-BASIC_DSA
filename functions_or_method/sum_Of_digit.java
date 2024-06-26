package functions_or_method;
import java.util.*;

public class sum_Of_digit {

    public static int DigitSum(int n){

        int sumOfdigit = 0;

        while(n>0){
        int LastDigit = n % 10;
        sumOfdigit += LastDigit;
        n = n/10;
        }
        return sumOfdigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit ");
        int n = sc.nextInt();
        System.out.println(DigitSum(n));

        sc.close();
    }
}
