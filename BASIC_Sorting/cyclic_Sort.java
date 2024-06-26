package BASIC_Sorting;

public class cyclic_Sort {

    public static void cyclic_sort(int arr[]){
        int i = 0;

        while(i < arr.length){

            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 1, 4};
        cyclic_sort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
