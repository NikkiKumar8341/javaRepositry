package Threads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {
        Developer john=new Developer("john");
        john.add("clojure");
        john.add("scala");
        john.add("groovy");
        john.add("go");

        System.out.println(john.hashCode());

        Developer nikki=new Developer("nikki");
        System.out.println(nikki.hashCode());
        nikki.add("java");
        nikki.add("javaScript");

        Developer ram=new Developer("Ram");
        ram.add("java");
        ram.add("python");

        List<Developer> developersTeam=new ArrayList<>();

        developersTeam.add(john);
        developersTeam.add(nikki);
        developersTeam.add(ram);

        System.out.println("Programming language in team:");

        developersTeam.stream()
                .map(Developer::getLanguage)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
