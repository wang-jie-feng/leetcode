package com.fire.array;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/14 23:25
 * @histoty 2019/9/14 23:25 created by jiefeng
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        if (matrix[0].length == 0)
            return false;
        int rowNumber = 0;
        int colNumber = matrix[0].length-1;
        while (rowNumber < matrix.length && colNumber >=0){
            if (matrix[rowNumber][colNumber] == target)
                return true;
            else if (target < matrix[rowNumber][colNumber])
                colNumber--;
            else
                rowNumber++;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(new SearchA2DMatrix().searchMatrix(new int[1][2], 3));
    }
}
