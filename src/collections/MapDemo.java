package collections;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,String> hm=new TreeMap<Integer,String>();
        hm.put(1023,"nikki");
        hm.put(1025,"nikhil");
        System.out.println(hm);

//        Set<Map.Entry<Integer,String>> se=hm.entrySet();
//
//        Iterator<Map.Entry<Integer,String>> i= se.iterator();
//        while (i.hasNext()){
//            Map.Entry<Integer,String> e= i.next();
//
//            System.out.println(e.getKey()+" "+e.getValue());
//        }

//        for (Map.Entry<Integer,String> e: hm.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }

        hm.forEach((key,value)-> System.out.println(key+" "+value));

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println("original list: " + numbers);

        List<Integer> even = numbers.stream()
                .map(s -> Integer.valueOf(s))
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("processed list, only even numbers: " + even);


        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(78);
        listOfInteger.add(10);
        listOfInteger.add(20);
        listOfInteger.add(30);

        Spliterator<Integer> s = listOfInteger.spliterator();
        Spliterator<Integer> s1 = s.trySplit();

        s.forEachRemaining(System.out::println);
        System.out.println("Traverse Second Half ");
        s1.forEachRemaining(System.out::println);

    }
}
