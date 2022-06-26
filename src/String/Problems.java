package String;

public class Problems {

    public static void main(String[] args) {
//        String str = "9669";
//
//        // Get the index
//        int index = 1;
//
//        // Get the character
//        char ch = '6';
//
//        // Print the original string
//        System.out.println("Original String = " + str);
//
////        System.out.println("substring : "+str.substring(1,4));
////
////        System.out.println(" hi "+ch+str.substring(index + 1));
//
//        str = str.substring(0, index) + ch
//                + str.substring(index + 1);
//
//        // Print the modified string
//        System.out.println("Modified String = " + str);

        String str = "9669";

        // Get the index
        int index = 0;

        // Get the character
        char ch = '6';

        // Print the original string
        System.out.println("Original String = " + str);

        String str1 = str.substring(0, index) + ch
                + str.substring(index + 1);

        // Print the modified string
        System.out.println("first index String = " + str1);


        int index1 = 1;

        char ch1 = '9';

        String str2 = str.substring(0, index1) + ch1 + str.substring(index1 + 1);

        System.out.println("second index String=" + str2);

        int index2 = 2;
        char ch2 = '9';

        String str3 = str.substring(0, index2) + ch2 + str.substring(index2 + 1);

        System.out.println("third index of string=" + str3);

        int index3 = 3;
        char ch3 = '6';

        String str4 = str.substring(0, index3) + ch3 + str.substring(index3 + 1);

        System.out.println("fourth index of the String " + str4);

        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str1);
        int c = Integer.parseInt(str2);
        int d = Integer.parseInt(str3);
        int e = Integer.parseInt(str4);

    }
}