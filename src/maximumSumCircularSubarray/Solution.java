package maximumSumCircularSubarray;

import java.util.stream.IntStream;

class Solution {
    public int maxSubarraySumCircular(int[] a) {
        return Math.max(oneInterval(a), twoIntervals(a));
    }

    private int oneInterval(int[] a) {
        int max = Integer.MIN_VALUE;
        int curr = a[0];
        for (int i = 1; i < a.length; i++) {
            curr = Math.max(curr + a[i], a[i]);
            max = Math.max(curr, max);
        }
        return max;
    }

    private int twoIntervals(int[] a) {
        int curr = 0;
        int min = curr;
        for (int i = 1; i < a.length - 1; i++) {
            curr = Math.min(curr + a[i], a[i]);
            min = Math.min(curr, min);
        }
        return IntStream.of(a).sum() - min;
    }
}