package ARRAY_LIST;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.*;

public class Sorting_by_inbuilt_method {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(11);
        list.add(9);
        list.add(15);
        list.add(17);
        list.add(19);
        list.add(22);

        System.out.println(list);
        //For Ascending order
        Collections.sort(list);
        System.out.println("element after Sorting : "+ list);

        //For descending Order
        Collections.sort(list, Collections.reverseOrder(null));
        System.out.println(list);
    }
}
