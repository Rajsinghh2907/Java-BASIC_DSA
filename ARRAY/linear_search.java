package ARRAY;

public class linear_search {

    public static int linearsearch(int number[],int key) {
        for(int i : number) {
            if (number[i]== key) {
            return i;
            }
        }        
    
    return -1;
    }
    public static void main(String[] args) {
        int number[] =  {2,4,6,7,9,11,15,56,66,78,90};
        int key = 9;
        int index = linearsearch(number,key);
        if(index == -1){
            System.out.println("Element not found");}
             else{
                System.out.print("The element is present at index : " + index);
             }

        }

    }


    
    
    