package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Ekart> getAll(){
        return Stream.of(
                new Ekart(101,"nikhil","nikhil@gmail.com", Arrays.asList("64646164","545045")),
                new Ekart(102,"akhil","akhil@gmail.com", Arrays.asList("64646414","544545")),
                new Ekart(103,"ram","ram@gmail.com", Arrays.asList("5454646414","4542114545")),
                new Ekart(104,"charan","charan@gmail.com", Arrays.asList("64955414","5611145"))
        ).collect(Collectors.toList());
    }


}
