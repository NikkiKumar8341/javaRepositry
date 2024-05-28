package patterns;

public class RightTriangle {

    static void printTriangle(int n) {
        // code here
        int star=1;
        for(int i=0;i<n;i++){

            if(i%2==0){
                star=1;
            }
            else{
                star=0;
            }

            for(int j=0;j<=i;j++){
                System.out.print(star+" ");
                star = 1-star;
            }

            System.out.println();

        }

    }


    public static void main(String[] args) {
        printTriangle(6);

    }
}
