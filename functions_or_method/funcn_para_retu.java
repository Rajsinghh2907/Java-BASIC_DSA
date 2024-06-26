package functions_or_method;
import java.util.*;

public class funcn_para_retu {
    public class funcn_parameter_exam {

        public static int calculatesum(int num1, int num2) {
          int sum = num1 + num2 ;
          System.out.println("sum is " + sum);
          return 0;
        }
      
          public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int a = sc.nextInt();
              int b = sc.nextInt();
              calculatesum(a,b);
             
              sc.close();
          }
      }
      
    
}
