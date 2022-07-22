package Template;

import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        Class c=Class.forName("Template.Ab");

        Ab t=(Ab)c.newInstance(); 

        Method m=c.getDeclaredMethod("show",null);

        m.setAccessible(true);

        m.invoke(t,null);

    }
}
