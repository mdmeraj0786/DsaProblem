package Gfg.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class ConcertArraysReducedFor {

    public static void main(String[] args) {

        int n = 5;
        int[] arr = {5,10,40,30,20};

       int count = 0;
       int []arr1 = new int[n];
       for(int i = 0; i < n; i++){
           arr1[i] = arr[i];
       }
       Arrays.sort(arr1);

      for(int i = 0; i < n; i++){
           if(arr[i] == arr1[i]){
               System.out.println(i);
           }
        }
    }
}
