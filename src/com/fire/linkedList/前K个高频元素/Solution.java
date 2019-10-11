package com.fire.linkedList.前K个高频元素;

import com.sun.xml.internal.bind.v2.model.core.ID;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

class Solution {
    private class Freq implements Comparable<Freq>{

        private int e,freq;

        public Freq(int e, int freq){
            this.e = e;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq another) {
            if (this.freq < another.freq)
                return -1;
            else if (this.freq > another.freq){
                return 1;
            }else
                return 0;
        }
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
//        统计频次
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num,map.get(num)+1);
            else
                map.put(num,1);
        }

        PriorityQueue<Freq> pq = new PriorityQueue<>();
        for (Integer key : map.keySet()) {
            if (pq.size() < k){
                pq.add(new Freq(key,map.get(key)));
            }else if (map.get(key) > pq.peek().freq){
                pq.remove();
                pq.add(new Freq(key,map.get(key)));
            }
        }

        LinkedList<Integer> res = new LinkedList<>();
        while (!pq.isEmpty()){
            res.add(pq.remove().e);
        }
        return res;
    }
}