package Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Methods {

    public static void main(String[] args) {


        List<String> names= Arrays.asList("nikhil","Akhil","Ankit","Abhinav","Aman");


        List<String> newNames=names.stream().map(d->d.toLowerCase()).filter(e->e.startsWith("a")).collect(Collectors.toList());


        System.out.println("name starting with A: "+newNames);

        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);

        System.out.println(numbers);

        List<Integer> newnumber=numbers.stream().map(i->i*i).collect(Collectors.toList());

        System.out.println("hi: "+newnumber);

        newnumber.stream().forEach(
                e->{
                    System.out.println(e);
                }
        );

        numbers.stream().sorted().forEach(System.out::println);

       Integer com= numbers.stream().min((x,y)->x.compareTo(y)).get();

        System.out.println("min: "+com);

        Integer com1=numbers.stream().max((x,y)->x.compareTo(y)).get();

        System.out.println("max: "+com1);

    }
}
