package BASIC_Sorting;

public class Bubble_sort {
    public static void bubblesort(int arr[]) {
        for(int turn = 0; turn < arr.length - 1; turn ++){
            for(int j = 0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){

                    //Swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {5,2,8,3,9,1,2,7,11,13,65,77,89,98,54,75,14};
        bubblesort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
}
