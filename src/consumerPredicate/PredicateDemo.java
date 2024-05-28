package consumerPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate= (t)->{
            if(t%2==0){
                return true;
            }
            else {
                return false;
            }
        };

        System.out.println(predicate.test(50));

        List<Integer> list1= Arrays.asList(1,5,3,4,6,74);
        list1.stream().filter(predicate).forEach(t -> System.out.println("print even:"+t));
    }
}
