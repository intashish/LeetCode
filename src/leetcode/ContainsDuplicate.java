package leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {

            if (hs.contains(num)) {
                return true;
            } else {
                hs.add(num);
            }
        }
        return false;
    }
}
