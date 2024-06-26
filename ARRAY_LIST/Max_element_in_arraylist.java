package ARRAY_LIST;

import java.util.ArrayList;

public class Max_element_in_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(11);
        list.add(9);
        list.add(6);
        list.add(5);

        //Find Max Element
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<list.size(); i++){
            if(max<list.get(i)){
                max = list.get(i);
            } 
                
                // we also write this
                // max = Math.max(max,list.get(i));
        }
        System.out.println("Maximum element In ArrayList is : "+max);
    }
}
