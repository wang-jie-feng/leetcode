/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-16 17:40:46
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-16 18:42:15
 */
package com.fire.array;

/**
 * Find
 * 一个二维数组，右边的数比左边大，下边的比上边的大，给一个数求位置，要求时间复杂度O(M+N) 空间复杂度O(1)
 * 在此数组里边，右上角一个数符合这样一个特性，即它左边的数都比他小，下边的数都比他大，所以我们只需要按照此规律开始遍历
 * 即可找到位置
 */
public class Find {

    public boolean find(int target, int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0;
        int c = cols -1;
        while(r <= rows-1 && c >= 0){
            if (target == matrix[r][c])
            return true;
        else if (target > matrix[r][c])
            r++;
        else
            c--;
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        int target = 20;
        System.out.println(new Find().find(target, matrix));
    }
}