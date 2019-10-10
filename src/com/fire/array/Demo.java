package com.fire.array;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/24 14:53
 * @histoty 2019/9/24 14:53 created by jiefeng
 */
public class Demo {
    public static void main(String[] args) {
        String a = "1-2-3-4";
        String[] split = a.split("-", 3);
        for (String s : split) {
            System.out.println(s);
            System.out.println(1+"");
        }
        String b = "a|b|";
        String[] split1 = b.split("|");
        for (String s : split1) {
            System.out.println(s);
        }
    }
}
