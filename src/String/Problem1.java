package String;

public class Problem1 {
    public static boolean containsUpperCaseLetter(String ab){
        for(int i=0;i<ab.length();i++){
            if(Character.isLowerCase(ab.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean containsLowerCaseLetter(String n){
        for (int i=0;i<n.length();i++){
            if(Character.isLowerCase(n.charAt(i))){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
      String ab="PANDa";

      String ba="history";
        System.out.println("the Panda is in Uppercase Letter: "+containsUpperCaseLetter(ab));

        System.out.println("the history is in lowerCase Letter :"+containsLowerCaseLetter(ba));

        String s1="HELLO";

//        char[] ch=s1.toCharArray();
//
//        for(int i=0;i<ch.length;i++){
//            if(Character.ch.charAt(i).isUpperCase())
//            {
//
//            }
//        }

    }
}
