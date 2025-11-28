package leetcode.array;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {

//        int[] newNums = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            if(i==0){
                continue;
            }
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
