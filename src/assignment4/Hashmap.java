package assignment4;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Long, String> ob = new HashMap<Long, String>();
        ob.put(855590149L, "nikhil");
        ob.put(994929406L, "nikki");
        ob.put(767107171L, "akhil");
        ob.put(67584939L, "murali");
        ob.put(53222244L, "ram");
        ob.put(13748392L, "ravi");
        ob.put(574838823L, "aksah");
        System.out.println(ob);
        System.out.println(ob.containsKey(799709880L));
        System.out.println(ob.containsValue("ravi"));
        for (Map.Entry<Long, String> set :
                ob.entrySet()) {


            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
    }
}
