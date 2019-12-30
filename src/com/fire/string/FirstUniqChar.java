/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-11 10:45:10
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-16 18:28:22
 */
package com.fire.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * FirstUniqChar
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)+"")) {
                map.put(s.charAt(i)+"", 1);
            }else{
                map.put(s.charAt(i)+"", map.get(s.charAt(i)+"")+1);
            }
        }
        Set<String> keySet = map.keySet();
        for (String item : keySet) {
            if (map.get(item) == 1) {
                return s.indexOf(item);
            }
        }
        return -1;        
    }

    
    public static void main(String[] args) {
        String a = "lleet";
        System.out.println(new FirstUniqChar().firstUniqChar(a));
    }

}