package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class ConsImpl implements Consumer<Integer> {
//    public void accept(Integer i){
//        System.out.println(i);
//    }
//}

public class DemoForEach {

    public static void main(String[] args) {

        List<Integer> values= Arrays.asList(4,5,6,7,8);

       Consumer<Integer> c=new Consumer<Integer>() {
           @Override
           public void accept(Integer integer) {
               System.out.println(integer);
           }
       };

        values.forEach(c);
    }
}
