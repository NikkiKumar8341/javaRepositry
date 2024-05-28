package Stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {
        //Stream Api -collection process
        //Collection / group of object

        //1-blank
        Stream<Object> emptyStream=Stream.empty();

        String names[]={"nikki","akhil","nikhil","Ram","Power star"};

        Stream<String> stream1=Stream.of(names);

        stream1.forEach(e->{
            System.out.println(e);
        });

        //Bulider pattern

        Stream<Object> streamBuilder=Stream.builder().build();

        //2
        IntStream stream=Arrays.stream(new int[]{51,65,3,4,6,4841,6});

        //5.list, set object

        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(96);
        list.add(78);


        Stream<Integer> stream2=list.stream();

        stream2.forEach(e->{
            System.out.println(e);
        });




    }
}
