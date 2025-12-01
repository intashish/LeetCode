package leetcode.array.medium;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int result = minSubArrayLen(target, nums);
        System.out.println(result);
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int i = 0;                       // left boundary of window
        int total = 0;                   // current window sum
        int minLen = Integer.MAX_VALUE;  // store minimum length found

        // expand window by moving j from 0..n-1
        for (int j = 0; j < nums.length; j++) {
            total += nums[j];

            // while current window sum >= target, try to shrink from left
            while (total >= target) {
                minLen = Math.min(minLen, j - i + 1);
                total -= nums[i];
                i++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
