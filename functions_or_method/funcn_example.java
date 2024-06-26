package functions_or_method;
//import java.util.*;

public class funcn_example {

    public static void printhello() {
        System.out.println("hello bro");
        System.out.println("are you all right");
        //return;   //return needed  
    }

    public static int calculatesum() {     //multiple function in single class
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
        return 0;
        
    }

    public static int CalculateMultiply(){
        int a = 20;
        int b = 10;
        int product = a * b ;
        System.out.println(product);
        return 0;
    }
    public static void main(String[] args) {
        printhello(); // function call needed
        CalculateMultiply();
        printhello(); 
        calculatesum();
    }
    
}
