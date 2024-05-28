package exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionDemo
{


    public static void main(String[] args) {

        List<String> list= Arrays.asList("44","65","98","454p");

        list.forEach(ExceptionDemo::printList);

//        List<Integer> intList=list.stream().map(Integer::parseInt).collect(Collectors.toList());
//
//        System.out.println(intList);
    }

    public static void printList(String s){
        try {
            System.out.println(Integer.parseInt(s));
        }
        catch (Exception ex){
            System.out.println("exception: "+ex.getMessage());
        }
    }
}
