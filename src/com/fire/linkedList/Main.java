package com.fire.linkedList;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,1511,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
//        System.out.println(Sum.sum(arr));
//        new Main().a();
        String qq = "5114@qq.com";
        System.out.println(qq.contains("@qq.com"));
        Map map = new HashMap();
        map.put(1,1);
        map.put(1,1);
        System.out.println(map.get(2));
    }

    public void a(){
        System.out.println("a");
        a();
    }
}
