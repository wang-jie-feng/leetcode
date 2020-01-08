/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-12 16:09:38
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-16 18:03:16
 */
package com.fire.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * IsAnagram
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        LinkedHashMap sMap = getMap(s);
        LinkedHashMap tMap = getMap(t);
        if (s.length() != t.length()) {
            return false;
        }
        Set<String> set = sMap.keySet();
        for (String item : set) {
            if (sMap.get(item) != tMap.get(item)) {
                return false;
            }
        }
        return true;   
    }

    public LinkedHashMap getMap(String str){
        char[] cstr = str.toCharArray();
        Arrays.sort(cstr);
        LinkedHashMap<String,Integer> map = new LinkedHashMap();
        for (int i = 0; i < cstr.length; i++) {
            if (map.isEmpty() || map.get(""+cstr[i]) == null) {
                map.put(cstr[i]+"",1);
            }else{
                map.put(cstr[i]+"",map.get(""+cstr[i])+1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
    }
}