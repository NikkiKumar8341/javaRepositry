package String;

public class StringMethod {

    public static void main(String[] args) {
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);

        //comapare to.
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2));

        //concat
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        //contains
        String data = "Nikki";
        System.out.println(data.contains("Ni"));   // true
        System.out.println(data.contains("k"));     // true
        System.out.println(data.contains("Hi"));    // false

        //contentEquals
        // Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer

        String data1 = "Hello";
        System.out.println(data1.contentEquals("Hello"));  // true
        System.out.println(data1.contentEquals("e"));      // false
        System.out.println(data1.contentEquals("Hi"));


        //copyValueOf

        char[] data3 = {'H', 'e', 'l', 'l', 'o'};
        String data4 = "";
        data4 = data4.copyValueOf(data3, 0, 5);
        System.out.println("Returned String: " + data4);


    }
}
