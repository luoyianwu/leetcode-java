package maximumSumCircularSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxSubarraySumCircularWithOneInterval() {
        Solution s = new Solution();
        assertEquals(3, s.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
        assertEquals(4, s.maxSubarraySumCircular(new int[]{3, -1, 2, -1}));
        assertEquals(3, s.maxSubarraySumCircular(new int[]{3, -2, 2, -3}));
        assertEquals(-1, s.maxSubarraySumCircular(new int[]{-2, -3, -1}));
    }

    @Test
    void maxSubarraySumCircularWithTwoIntervals() {
        Solution s = new Solution();
        assertEquals(10, s.maxSubarraySumCircular(new int[]{5, -3, -1, -2, 5}));
        assertEquals(11, s.maxSubarraySumCircular(new int[]{5, -3, 4, -5, 5}));
        assertEquals(9, s.maxSubarraySumCircular(new int[]{4, -2, 3, -100, -1, 4}));
        assertEquals(152, s.maxSubarraySumCircular(new int[]{5,-19,10,-15,22,-2,-11,28,-29,10,1,2,22,-23,-9,-30,-6,-9,1,8,24,2,21,29,10,-25,18,30,1,9}));
    }
}