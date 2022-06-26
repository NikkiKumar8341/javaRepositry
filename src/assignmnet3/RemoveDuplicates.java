package assignmnet3;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        LinkedList<Integer> ni=new LinkedList<Integer>();
        ni.add(1);
        ni.add(5);
        ni.add(9);
        ni.add(9);
        ni.add(5);
        ni.add(1);
        System.out.println("Element in LinkedList: "+ni);

        LinkedHashSet<Integer> ob1=new LinkedHashSet<Integer>(ni);

        System.out.println("Element in LinkedHashSet: "+ob1);

    }
}
