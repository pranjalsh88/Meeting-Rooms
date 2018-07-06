package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortedIndices {

    public static List<Integer> printDecreasingOrder(String[] numbers) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.val == o2.val) {
                return o1.index-o2.index;
            }
            else return o2.val - o1.val;
        });
        for (int i=0; i<numbers.length; i++) {
            try {
                int number = Integer.parseInt(numbers[i]);
                pq.offer(new Node(number, i));
            } catch (Exception e) {}
        }
        if (pq.isEmpty()) {
            throw new IllegalArgumentException();
        }
        while (!pq.isEmpty()) {
            list.add(pq.poll().index);
        }
        return list;
    }
}
