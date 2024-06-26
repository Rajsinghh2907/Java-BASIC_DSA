package BIT_Manipulation;

import java.util.*;

public class Set_ith_bits {

    public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;

        return n | bitMask;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number");
      int n = sc.nextInt();
      int i = 2;

      System.out.println(SetIthBit(n,i));

      sc.close();
    }
}
