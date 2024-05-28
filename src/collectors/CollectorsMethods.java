package collectors;

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

import static collectors.City.prepareTemperature;

public class CollectorsMethods {

    public static void main(String[] args) {

        System.out.println("city name with temperature less than 10  "+prepareTemperature().stream()
                .filter(f -> f.getTemperature() > 10)
                .map(f -> f.getName())
                .collect(Collectors.toList()));

        System.out.println();

        System.out.println("couting int"+prepareTemperature()
                .stream()
                .collect(Collectors.groupingBy(
                        City::getName,
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                f -> f.intValue()))));
        System.out.println();


        System.out.println("group by "+prepareTemperature()
                .stream()
                .collect(Collectors.groupingBy(City::getName)));

        System.out.println();

        System.out.println("joining: "+prepareTemperature()
                .stream()
                .filter(city -> city.getTemperature() > 10)
                .map(f -> f.getName())
                .collect(Collectors.joining(", ")));

        System.out.println();

        System.out.println("prefix of city name and suffix"+prepareTemperature()
                .stream()
                .filter(city -> city.getTemperature() > 10)
                .map(f -> f.getName())
                .collect(Collectors.joining(" ",
                        "Prefix:", ":Suffix")));

        System.out.println();

        System.out.println("list of city"+prepareTemperature()
                .stream()
                .collect(Collectors.groupingBy(
                        City::getName,
                        Collectors.mapping(
                                City::getTemperature,
                                Collectors.toList()))));

        System.out.println();

        System.out.println("set of city "+prepareTemperature()
                .stream()
                .collect(Collectors.groupingBy(
                        City::getName,
                        Collectors.mapping(
                                City::getTemperature,
                                Collectors.toSet()))));

        System.out.println();


        System.out.println("partitionby 15 degrees"+prepareTemperature()
                .stream()
                .collect(Collectors.partitioningBy(
                        city -> city.getTemperature() > 15)));

        System.out.println();
    }
}
