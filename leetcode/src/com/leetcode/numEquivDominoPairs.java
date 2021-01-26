package com.leetcode;

/**
 * 给你一个由一些多米诺骨牌组成的列表dominoes。
 *
 * 如果其中某一张多米诺骨牌可以通过旋转 0度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。
 *
 * 形式上，dominoes[i] = [a, b]和dominoes[j] = [c, d]等价的前提是a==c且b==d，或是a==d 且b==c。
 *
 * 在0 <= i < j < dominoes.length的前提下，找出满足dominoes[i] 和dominoes[j]等价的骨牌对 (i, j) 的数量。
 *
 * 同样的代码 只要三秒
 */

public class numEquivDominoPairs {

    public int solution(int[][] dominoes) {
        int[] freq = new int[100];

        int count = 0;
        for (int[] dominoe : dominoes) {
            if (dominoe[0] > dominoe[1]) {
                int temp = dominoe[0];
                dominoe[0] = dominoe[1];
                dominoe[1] = temp;
            }

            int num = dominoe[0] * 10 + dominoe[1];
            count += freq[num];
            freq[num]++;
        }
        return count;
    }

}
