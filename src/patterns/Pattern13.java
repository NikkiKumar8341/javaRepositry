package patterns;

public class Pattern13 {


    static  void Pattern13(int n){
        int num=1;
        for(int i=0;i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print(num);
                num=num+1;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Pattern13(4);
    }
}
