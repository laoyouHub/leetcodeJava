package com.leetcode;

// 线性查找
// 范型

public class Linearsearch {

    private Linearsearch() {
    }

    static <E> int search(E[] data, E target) {

        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Integer[] data = {2, 3, 4, 5, 96, 6, 7, 8, 8, 85, 9, 000, 0};
        int index = Linearsearch.search(data, 9);
        System.out.println(index);

        int res = Linearsearch.search(data, 100);
        System.out.println(res);
    }
}
