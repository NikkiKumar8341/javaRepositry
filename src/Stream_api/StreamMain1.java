package Stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamMain1 {

    public static void main(String[] args){

        List<Integer> list2=new ArrayList<>();

        list2.add(12);
        list2.add(14);
        list2.add(96);
        list2.add(98);

        List<Integer> list3=Arrays.asList(52,899,54,63,74,99);

        List<Integer> listEven=new ArrayList<>();

        for (Integer i:list3){
            if (i%2==0){
                listEven.add(i);
            }
        }

        System.out.println(listEven);

        //using stream

//        Stream<Integer> stream =list3.stream();

        List<Integer> newlist=list3.stream().filter(i-> i%2==1).collect(Collectors.toList());


        System.out.println(newlist);

        List<Integer> newlist1=list3.stream().filter(i->i>55).collect(Collectors.toList());

        System.out.println(newlist1);

        List<Integer> newlist2=list3.stream().map(i->i*i).collect(Collectors.toList());

        System.out.println(newlist2);


    }
}
