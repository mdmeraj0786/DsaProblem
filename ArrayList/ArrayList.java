package ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        for (int j : arr) {
            list.add(j);
        }
        System.out.println(list);

        for (int i = 0; i < n; i = i + 2) {
            Integer element = list.get(i);
            System.out.println(element);
        }
        System.out.println();

        for (int i = 0; i < n; i = i + 2){
            System.out.println("Enter the " +i +" number : ");
            list.add(i , sc.nextInt());
        }
        System.out.println(list);

        System.out.println();

        for(int i = 0 ; i < n; i = i+2){
            System.out.println("Enter the " +i +" number : ");
            list.set(i , sc.nextInt());
        }
        System.out.println(list);

        System.out.println();

        for (int i = 0; i < n; i = i+2){
            list.remove(i);
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
