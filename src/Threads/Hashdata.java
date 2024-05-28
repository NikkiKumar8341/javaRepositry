package Threads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashdata {

    public static void main(String[] args) {
        Map heap=new HashMap<String,String>();

        heap.put(1,"nikki");
        heap.put(null,null);
        heap.put(null,"interview");
        heap.put(null,"machine");
        heap.put(null,null);


        Set s=heap.entrySet();

        Iterator i= s.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
