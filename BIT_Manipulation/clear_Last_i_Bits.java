package BIT_Manipulation;

public class clear_Last_i_Bits {

    public static int ClearLastI_th_Bits(int n, int i){
        int bitMask = (~0)<< i;

        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(ClearLastI_th_Bits(15,2));
    }
}
