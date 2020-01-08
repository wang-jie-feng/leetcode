package com.fire.array;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/9 21:27
 * @histoty 2019/9/9 21:27 created by jiefeng
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,0,0,0};
        int[] b = new int[]{3,4,5};
        new MergeSortedArray().merge(a,3,b,3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int i = m+n-1;
        int j= m-1;
        int k= n-1;

//        有序数组，所以先从后往前比较，谁大添加谁，然后向前一位，如果其中一个用完了，那就只添加另一个
        while (i >= 0){
            if (j>=0 && k>=0){
                if (nums1[j] > nums2[k]){
                    nums1[i] = nums1[j];
                    j--;
                }else {
                    nums1[i] = nums2[k];
                    k--;
                }
            }else if (j >= 0){
                nums1[i] = nums1[j];
                j--;
            }else if (k >= 0){
                nums1[i] = nums2[k];
                k--;
            }
            i--;
        }
    }
}
