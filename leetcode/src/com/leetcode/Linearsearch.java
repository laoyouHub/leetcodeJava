package com.leetcode;

// 线性查找
public class Linearsearch {

    private Linearsearch(){}

    static int search(int[] data, int target) {

        for (int i = 0 ; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] data = {2,3,4,5,96,6,7,8,8,85,9,000,0};

        int index = Linearsearch.search(data,9);
        System.out.println(index);

        int res = Linearsearch.search(data, 100);
        System.out.println(res);


    }
}
