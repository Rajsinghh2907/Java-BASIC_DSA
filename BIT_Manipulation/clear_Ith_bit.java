package BIT_Manipulation;

import java.util.Scanner;

public class clear_Ith_bit {

    public static int ClearIthbit(int n, int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number");
      int n = sc.nextInt();
      int i = 1;
       System.out.println(ClearIthbit(n,i));

       sc.close();
    }
}
