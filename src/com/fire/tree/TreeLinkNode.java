/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-19 18:44:37
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-19 18:44:44
 */
public class TreeLinkNode {

    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null; // 指向父结点的指针

    TreeLinkNode(int val) {
        this.val = val;
    }
}