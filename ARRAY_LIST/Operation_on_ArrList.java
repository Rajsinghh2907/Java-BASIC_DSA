package ARRAY_LIST;
import java.util.ArrayList;

public class Operation_on_ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add Element on arrayList

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);


        //Get Operation 
        int element = list.get(2);
        System.out.println(element);


        //Delete Element in array list
        list.remove(2);
        System.out.println(list);


        //Set Element at particular index
        list.set(2,10);
        System.out.println(list);

        list.add(1,8);
        System.out.println(list);
    }
    
}
