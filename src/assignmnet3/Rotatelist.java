package assignmnet3;

import java.util.LinkedList;
import java.util.Scanner;

public class Rotatelist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n= sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("enter integer list values...?");

        for(int i=1;i<=n;i++){
            int ni= sc.nextInt();
            list.add(ni);
        }
        System.out.println("please enter position to rotate the list ..");
        int k = sc.nextInt();
        Rotatelist c = new Rotatelist();
        c.rotateList(list, k);
    }

    public void rotateList(LinkedList<Integer> list, int k) {
        while (k != 0) {
            list.addFirst(list.removeLast());
            k--;
        }
        System.out.println(list);
    }
}
