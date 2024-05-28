package lamddaExpression;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String str = null;

        Optional<String> str1=Optional.ofNullable(str);

        System.out.println(str1.isPresent());

//        System.out.println(str1.get());

        System.out.println(str1.orElse("No values is this object"));
    }
}
