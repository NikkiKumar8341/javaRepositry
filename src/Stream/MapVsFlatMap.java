package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Ekart> customer=EkartDataBase.getAll();

        //list<Ekart> convert list<String>-> data tranformation

        //customer -> customer.getEmail()  one to one mapping
        List<String> emails=customer.stream().map(customers -> customers.getEmail()).collect(Collectors.toList());

        System.out.println(emails);

        //customer -> customer.getPhoneNumber()  ->> one to  many Mapping
        List<List<String>> phoneNumber=customer.stream().map(customers->customers.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phoneNumber);

        List<List<String>> phoneNumbers=customer.stream().map(data->data.getPhoneNumber()).collect(Collectors.toList());

        //stream of streams
        //mapping : customers -> phoneNumbers
        List<String> phones=customer.stream()
                .flatMap(customers ->customers.getPhoneNumber().stream())
                .collect(Collectors.toList());

        System.out.println(phones);
    }
}
