package houseRobberII;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] withoutFirst = new int[nums.length - 1];
        int[] withoutLast = new int[nums.length - 1];
        System.arraycopy(nums, 1, withoutFirst, 0, withoutFirst.length);
        System.arraycopy(nums, 0, withoutLast, 0, withoutFirst.length);
        return Math.max(robWithDp(withoutFirst), robWithDp(withoutLast));
    }

    private int robWithDp(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int maxProfit2Earlier = i < 2 ? 0 : dp[i - 2];
            int maxProfit3Earlier = i < 3 ? 0 : dp[i - 3];
            dp[i] = Math.max(maxProfit2Earlier, maxProfit3Earlier) + nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}