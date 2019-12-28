/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-10 18:04:13
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 10:41:43
 */
package com.fire.array;

import java.util.Map;
import java.util.HashMap;

/**
 * IsValidSudoku
 */
public class IsValidSudoku {

    public boolean isValidSudoku(final char[][] board) {
        // init data
        Map<Integer, Integer> [] rows = new HashMap[9];
        Map<Integer, Integer> [] columns = new HashMap[9];
        Map<Integer, Integer> [] boxes = new HashMap[9];
        for (int i = 0; i < 9; i++) {
          rows[i] = new HashMap<Integer, Integer>();
          columns[i] = new HashMap<Integer, Integer>();
          boxes[i] = new HashMap<Integer, Integer>();
        }
    
        // validate a board
        for (int i = 0; i < 9; i++) {
          for (int j = 0; j < 9; j++) {
            final char num = board[i][j];
            if (num != '.') {
              final int n = (int)num;
              final int box_index = (i / 3 ) * 3 + j / 3;
    
              // keep the current cell value
              rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
              columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
              boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);
    
              // check if this value has been already seen before
              if (rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[box_index].get(n) > 1)
                return false;
            }
          }
        }
    
        return true;
      }
}