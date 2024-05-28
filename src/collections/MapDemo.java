package collections;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,String> hm=new TreeMap<Integer,String>();
        hm.put(1023,"nikki");
        System.out.println("hash code1 "+hm.hashCode());
        hm.put(1025,"nikhil");
        System.out.println("hash code2 "+hm.hashCode());
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        System.out.println("After invoking put() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(104,"Ravi");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.remove(100);
        System.out.println("Updated list of elements: "+map);

        hm.replace(102, "Gaurav");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

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
