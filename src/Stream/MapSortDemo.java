package Stream;

import java.util.*;
import java.util.Map.Entry;

public class MapSortDemo {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("two",2);
        map.put("four",4);
        map.put("eight",8);
        map.put("one",1);



        Map<Employee,Integer> employeeIntegerMap=new TreeMap<>(
            ( o1,  o2)-> {
                return (int) (o1.getAge()-o2.getAge());
            }
        );

        employeeIntegerMap.put(new Employee(101,"nikhil",25,25000,"Hyderabad"),14);
        employeeIntegerMap.put(new Employee(104,"akhil",22,25000,"Warangal"),45);
        employeeIntegerMap.put(new Employee(105,"ram",65,600000,"eastgodavari"),12);
        employeeIntegerMap.put(new Employee(103,"venu",35,55000,"Delhi"),63);
        employeeIntegerMap.put(new Employee(102,"murali",55,65000,"banglore"),96);




        System.out.println(employeeIntegerMap);

        List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());

        Collections.sort(entries,(key1,key2)->{
            return key1.getValue().compareTo(key2.getValue());
        });

        System.out.println(entries+"jnj");

//        List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
//        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
//            @Override
//            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//                return o1.getKey().compareTo(o2.getKey());
//            }
//        });
//
//
//        for (Entry<String,Integer> entry :entries){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

    }
}
