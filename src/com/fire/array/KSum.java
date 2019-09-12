package com.fire.array;

import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/11 22:17
 * @histoty 2019/9/11 22:17 created by jiefeng
 */
public class KSum {
//    传入当前数组，开始值（倒数第二个值，即是下标），第一个数，第二个数 目标值，返回值
    public void twoSum(int[] num, int begin, int first, int second, int target, List<List<Integer>> ret){
        if (begin >= num.length -1){
            return;
        }
        int b = begin;
        int e = num.length - 1;
        while (b<e){
            int rest = num[b] = num[e];
            if (rest == target){
                List<Integer> temRet = new ArrayList<>();
                temRet.add(first);
                temRet.add(second);
                temRet.add(num[b]);
                temRet.add(num[e]);
                do {
                    b++;
                }while (b<e && num[b] == num[b-1]);

                do {
                    e--;
                }while (b<3 && num[e] == num[e+1]);
            }else if (rest < target){
                b++;
            }else {
                e--;
            }
        }
    }
}
