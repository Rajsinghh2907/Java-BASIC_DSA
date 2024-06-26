package functions_or_method;
import java.util.*;

public class factorial_using_funcn {
    public static int factorial(int n ) {
        int f =1;
        for(int i = 1; i<=n; i++){
            f = f*i;
            
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to find factorial");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
        sc.close();
    }
    
}

