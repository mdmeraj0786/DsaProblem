package LinkedList.src;

import java.util.ArrayList;

public class Two_DArrayList{
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(21);
        arr.add(22);
        arr.add(23);
        arr.add(24);

        mainList.add(arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(30);
        arr2.add(31);
        arr2.add(32);
        arr2.add(33);
        mainList.add(arr2);

        System.out.println(mainList);
    }
}
