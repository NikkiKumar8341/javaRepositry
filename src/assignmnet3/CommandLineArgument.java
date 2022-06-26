package assignmnet3;

public class CommandLineArgument {

    public static void main(String[] args) {
        System.out.println("Given Number"+Integer.parseInt(args[0]));

        System.out.println("Binary equivalent"+Integer.toBinaryString(20));

        System.out.println("Octal equivalent"+Integer.toOctalString(20));

        System.out.println("Hexadecimal equivalent"+Integer.toHexString(20));
    }
}
