package leetcode;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

//        int[] nums = {3,2,3};
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {

//        int n = nums.length;
//        Arrays.sort(nums);
//        Map<Integer, Integer> counting = new HashMap<>();
//
//        for(int num: nums){
//            counting.put(num,counting.getOrDefault(num, 0)+1);
//        }
//
//        int count = 0;
//        for(Map.Entry<Integer, Integer> entry : counting.entrySet()){
//           if(entry.getValue() > n/2){
//               return entry.getKey();
//           }
//        }
//        return -1;

        //New code with o(1) space. Cancelling out each other.
        int candidate = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }

            if(candidate == num){
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
