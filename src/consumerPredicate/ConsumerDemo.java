package consumerPredicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Integer> consumer= (t)->{
            System.out.println("printing : "+t);
        };

        consumer.accept(10);

        List<Integer> list1= Arrays.asList(1,5,3,4,6,74);


        list1.stream().forEach(consumer);

    }
}
