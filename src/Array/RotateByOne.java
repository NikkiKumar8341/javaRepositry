package Array;

import java.sql.Array;

public class RotateByOne {


    public static void rotateByOne(int arr[]){
        int temp=arr[0];
        int n= arr.length;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }

    public static int removeDuplicates(int arr[]){
        int i=0;

        for(int j=1;j<arr.length-1;j++){
            if(arr[i]!= arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

        return i+1;

    }

    public static void main(String[] args) {

        int n=5;

        int arr[]= {1,2,3,4,5};

//        rotateByOne(arr);

        int arr1[] ={1,1,2,2,2,3,3,4};
        int k = removeDuplicates(arr1);

        for (int i=0;i<k;i++){
            System.out.println(arr1[i]+" ");
        }

    }
}

