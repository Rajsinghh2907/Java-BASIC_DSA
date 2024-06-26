package functions_or_method;

public class swap_using_funcn {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a value is " + a);
        System.out.println("b value is " + b);
        
    }
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ; 
        swap(a,b);

    }
    
}
