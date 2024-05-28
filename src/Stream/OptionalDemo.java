package Stream;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Ekart getCustomerByEmailId(String email) throws Exception {
        List<Ekart> customers=EkartDataBase.getAll();
        return customers.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow(()-> new Exception("no customer fouund") {
                });
    }

    public static void main(String[] args) throws Exception {
        Ekart customer=new Ekart(101,"nikhil",null, Arrays.asList("25136","364785"));


//        Optional<String> emailOptional=Optional.of(customer.getEmail());

//        System.out.println(emailOptional);

        Optional<String> emailOptional1=Optional.ofNullable(customer.getEmail());

//        System.out.println(emailOptional1);

//        System.out.println(emailOptional1.orElseThrow(()-> new IllegalArgumentException("email not present")));

        getCustomerByEmailId("khdbfkjbdf");
    }
}
