package collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Demo {

    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,34,56,78,90);

        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
