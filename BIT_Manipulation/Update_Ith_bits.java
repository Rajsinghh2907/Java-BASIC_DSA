package BIT_Manipulation;

public class Update_Ith_bits {

    public static int ClearIthbit(int n, int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }

    public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;

        return n | bitMask;
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        if(newBit == 0){
            return ClearIthbit(n,i);
        }
        else{
            return SetIthBit(n,i);
        }
    }
       
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10,2,1));
    }
}
