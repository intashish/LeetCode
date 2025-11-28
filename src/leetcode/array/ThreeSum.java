package leetcode.array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
//        List<List<Integer>> result = threeSum(nums);
        List<List<Integer>> result = optThreeSum(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int index=0; index< nums.length-2;index++){

            if(index > 0 && nums[index] == nums[index-1]) continue;
            int target = -nums[index];
            Map<Integer, Integer> hm = new HashMap<>();

            for(int i = index+1; i < nums.length; i++){

                int temp = target - nums[i];
                if(!hm.containsKey(temp)){
                    hm.put(nums[i], i);
                }else{
                    result.add(Arrays.asList(target, nums[i], temp));
                    while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
                }
            }
        }

        return  result;
    }

    public static List<List<Integer>> optThreeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // to skip the duplicate

            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];

            //This part is 2 sum problem and also added check for it the array has duplicate value.
            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;// skip current duplicate value because it has been processed.
                    while (left < right && nums[right] == nums[right - 1]) right--;//

                    left++;
                    right--;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}
