package Stream;

import java.util.Arrays;
import java.util.List;

public class MpaReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,4,56,7,7,78);

        int sum=0;

        for (int n:numbers){
            sum=sum+n;
        }

        System.out.println(sum);

        int sum1=numbers.stream().mapToInt(i->i).sum();

        System.out.println(sum1);

        Integer reduceMax = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);

        System.out.println(reduceMax);

    }
}
