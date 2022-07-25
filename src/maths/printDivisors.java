package maths;

public class printDivisors {

    static void printDivisors(int n){
        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");

                if (i!=n/i)
                    System.out.println((n/i)+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n=35;
        printDivisors(n);
    }
}
