package main;

import java.util.Arrays;

public class BottomUp {
// Bottom Up
// Dynamic Programming Technique 
// edu@rawand.dev
    static int[] arr;

    static int fibBottomUp(int num){
    
        for (int i = 2; i <= arr.length-1; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[num];
    }

    public static void main(String[] args) {
        int num = 20;
        arr = new int[num+1];
            arr[0] = 0;
            arr[1] = 1;
        System.out.println(fibBottomUp(num));
        System.out.println(fibBottomUp(10));
        System.out.println(fibBottomUp(9));
        System.out.println(Arrays.toString(arr));
    }
}