package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]

        // 2 sum problem by using hashset. here we need to return the index value and not the value.
        int[] nums = {1,4,2,7,11,15};
        int target = 9;

        Map<Integer,Integer> temp = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int finder = target - nums[i];
            if(!temp.containsKey(finder)){
                temp.put(nums[i], i);
                continue;
            }
            System.out.println(i+", "+ temp.get(finder));
//            return new int[]{i, temp.get(finder)};
        }

        //2 Pointer solution when we have to return the value and not the index
        int[] num1 = {3,2,4}; //2,3,4
        Arrays.sort(num1);
        target = 6;
        int right = 0;
        int left = nums.length-1;

        while(right < left){
            int sum = num1[right] + num1[left];
            if(sum < target){
                right++;
            } else if( sum > target){
                left--;
            } else{
                System.out.println(right+", "+ left);
                break;
            }
        }
    }
}
