package com.fire.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/14 21:52
 * @histoty 2019/9/14 21:52 created by jiefeng
 */
public class MaximalRectangle {

    /**
     * 思路；首先求出每一行的柱状图，类似于柱状图哪一题，然后使用那一题的解法
     * @param matrix
     * @return
     */
    public int maximalRectangle(char[][] matrix) {

//        注意空的情况，不然通不过提交的代码
        if (matrix.length == 0 || matrix == null || matrix[0].length == 0 || matrix[0] == null){
            return 0;
        }
//        1. 转换直方图，如果为零那么就为零，如果不为零，那么值为前一行相同列的值加一
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] height = new int[m][n];

//        初始化高度的数组，如果为'0'那么高度为0，如果为'1'的话，那么高度为前一个的高度加一
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == '0'){
                    height[i][j] = 0;
                }else {
                    height[i][j] = (i==0)?1:height[i-1][j] + 1;
                }
            }
        }

//        对于每一行调用直方图求面积的方法来求面积
        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            maxArea = Math.max(maxArea,largestRectangleArea(height[i]));
        }

        return maxArea;
    }

    public int largestRectangleArea(int[] heights) {
        List<Integer> s = new ArrayList<>();
        int[] myHeights = new int[heights.length+1];
//        末尾添加一个用于最后的结束遍历
        myHeights[heights.length] = 0;
        for (int i = 0; i < heights.length; i++) {
            myHeights[i] = heights[i];
        }


        int sum = 0;
        int i = 0;
        while (i<myHeights.length){
//            如果比数组里边最后一个大那么添加进去，且继续循环，否则将数组里边的数减一，因为矩形可以一直连到上一个比他小的所以每次需要移除最后一个元素
//            如果循环到比之前小，那么会将之前所有的可能都遍历一遍
            if (s.isEmpty() || myHeights[i] > myHeights[s.get(s.size()-1)]){
                s.add(i);
                i++;
            }else {
                int t = s.get(s.size()-1);
//                使用此可以遍历之前所有的可能性，因为s里边最后一个肯定小于当前值，
                s.remove(s.size()-1);
                sum = Math.max(sum,heights[t]*(s.isEmpty()? i:i-s.get(s.size()-1)-1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        char[][] matrix = new char[4][4];
        matrix[0][0] = '0';
        matrix[0][1] = '1';
        matrix[0][2] = '0';
        matrix[0][3] = '0';
        matrix[1][0] = '1';
        matrix[1][1] = '1';
        matrix[1][2] = '1';
        matrix[1][3] = '0';
        matrix[2][0] = '1';
        matrix[2][1] = '1';
        matrix[2][2] = '1';
        matrix[2][3] = '1';
        matrix[3][0] = '0';
        matrix[3][1] = '0';
        matrix[3][2] = '0';
        matrix[3][3] = '0';
        System.out.println(new MaximalRectangle().maximalRectangle(matrix));
    }

}
