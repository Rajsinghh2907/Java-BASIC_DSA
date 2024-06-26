package BASIC_Sorting;

public class selection_sort {

    public static void selectionsort(int arr[]) {
        for(int i = 0; i<arr.length - 1; i++){
            int Minpos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[Minpos] < arr[j] ){  // For Decending Order
                 //if(arr[Minpos] > arr[j] ) for ascending order
                Minpos = j;
            }
        }
        //SWAPPING
        int temp = arr[Minpos];
        arr[Minpos] = arr[i];
        arr[i] = temp;
    }
        
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,9,7,};
        selectionsort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
