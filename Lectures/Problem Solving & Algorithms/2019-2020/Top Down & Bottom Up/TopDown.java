package main;

import java.util.Arrays;

public class TopDown {
// Top Down
// Dynamic Programming Technique 
// edu@rawand.dev
    static int[] arr;

    static int fibTopDown(int num){
        if (num == 0)
            return 0;

        if (arr[num]==0){
            if (num == 1){
                arr[num] = 1;
            } else {
                arr[num] = (fibTopDown(num-1) + fibTopDown(num-2));
            }
        }

        return arr[num];
    }

    public static void main(String[] args) {
        int num = 13;
        arr = new int[num+1];
        System.out.println(fibTopDown(num));
        System.out.println(Arrays.toString(arr));
    }
}