package ARRAY;

public class largest_number_arrar {
    public static void getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //use for -(minus) infinity
        

        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]) {
                largest = numbers[i];
            }

        }
        //return largest;
         System.out.println("largest number in an array is : " + largest);

    }
    public static void main(String[] args) {        
        int numbers[] = {12,6,44,3,5,6,6,7,77,5,5,43,22};
        getlargest(numbers);
        //System.out.println("largest number in an array is : " + getlargest(numbers));

    }
     
       }
    