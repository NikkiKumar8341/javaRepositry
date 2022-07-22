package assignment9;

import java.util.Scanner;

public class Question2 {
    static void thirdLargest(int arr[],int arr_size){
        if(arr_size<3){
            System.out.println("invalid input");
            return;
        }
        //find first //largest element
        int first=arr[0];

        for (int i=1;i<arr_size;i++){
            if(arr[i]>first)
                first=arr[i];
        }
        System.out.println("first largest is "+first);

        //find second
        //second largest
        int second=Integer.MIN_VALUE;

        System.out.println(second);

        for (int i=0;i<arr_size;i++){
            if (arr[i]>second && arr[i]<first)
                second=arr[i];
        }
        int third=Integer.MIN_VALUE;

        for (int i=0;i<arr_size;i++){
            if (arr[i]>third && arr[i]<second)
                third=arr[i];
        }
        System.out.println("the third maximum value "+"element is "+third);


    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++ ) {
            arr[i] = sc.nextInt();
        }

        thirdLargest(arr, n);
    }
}
