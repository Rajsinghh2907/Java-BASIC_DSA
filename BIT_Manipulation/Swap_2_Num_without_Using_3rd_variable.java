package BIT_Manipulation;

public class Swap_2_Num_without_Using_3rd_variable {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        System.out.println("Before Swap: x is " + x + " and y is " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

         System.out.println("After Swapping : x is " + x + " and Y is " + y);
    }
}
