package ARRAY;

public class smallest_number_inARRAY {

    public static int getsmallest(int number[]){
        int smallest = Integer.MAX_VALUE; // for positive infinity
        for(int i = 0; i<number.length; i++){
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int number[] = {12,23,24,11,32,31,32,34,23,22,39,12,40};
        System.out.println("smallest number in array is : " + getsmallest(number));
    }
}
