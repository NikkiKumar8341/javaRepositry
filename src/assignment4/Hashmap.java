package assignment4;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> ob = new HashMap<String, String>();
        ob.put("855590149", "nikhil");
        ob.put("994929406", "nikki");
        ob.put("767107171", "akhil");
        ob.put("67584939", "murali");
        ob.put("53222244", "ram");
        ob.put("13748392", "ravi");
        ob.put("574838823", "aksah");
        int ab=ob.hashCode();
//        int index =ob.hashcode(Key) & (n-1);
        int index=ob.hashCode() & (16-1);
        System.out.println("index: "+index);
        System.out.println(ob.containsKey("855590149"));
        System.out.println(ob.containsValue("ravi"));
        for (Map.Entry<String, String> set :
                ob.entrySet()) {


            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
    }
}
