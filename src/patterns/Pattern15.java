package patterns;

public class Pattern15 {

    static void pattern15(int n){
        for(int i=0;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }


    }

    static void pattern18(int n){
        for(int i=0;i<=n;i++){
            for(int j=n-1;j>=n-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static  void pattern19(int n){
        for (int i = n; i >= 1; i--) {
            // Loop to print the stars on the left half of the triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Loop to print the spaces in the middle of the triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Loop to print the stars on the right half of the triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Loop to print the lower half of the triangle
        for (int i = 1; i <= n; i++) {
            // Loop to print the stars on the left half of the triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Loop to print the spaces in the middle of the triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Loop to print the stars on the right half of the triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int countDigit(int n){
        int count=0;
        while (n>0){
            int last_digit=n%10;
            count=count+1;
            n=n/10;
        }
        return  count;
    }

    static int revserve(int n){
        int revNum=0;

        while (n>0){
            int last_digit=n%10;
            revNum=(revNum*10)+last_digit;
            n=n/10;
        }
        return revNum;
    }

    public static boolean armstrong(int n){
        int sum=0;
        int temp=n;

        while(temp!=0){
            int last_Digit=temp%10;
            sum=sum+(last_Digit*last_Digit*last_Digit);
            temp=temp/10;
        }

        return sum==n;
    }

    static void printDivisors(int n){
        System.out.println("The divisors of "+n+" are:");
        for(int i = 1; i <= (int)Math.sqrt(n); i++)
            if(n % i == 0){
                System.out.print(i + " ");
                if(i != n/i) System.out.print(n/i + " ");
            }

        System.out.println();
    }

    public static void main(String[] args) {
//        pattern15(4)
        pattern18(5);

        System.out.println("-----------");

        pattern19(4);

        System.out.println(
                "-p-p-p-p-p-p-p-p"
        );

        System.out.println(countDigit(145));

        System.out.println(revserve(451));

        System.out.println(armstrong(21));

        printDivisors(36);
    }
}
