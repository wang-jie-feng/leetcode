package com.fire.linkedList;

public class Sum {
    public static int sum (int[] arr){
        return sum(arr,0);
    }

    private static int sum(int[] arr, int l){

//        递归中最小的问题
        if (l == arr.length){
            return 0;
        }
//        递归核心算法，将问题分解成更小的问题
        return arr[l] + sum(arr,l+1);
    }
}
