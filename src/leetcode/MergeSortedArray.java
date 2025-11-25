package leetcode;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1,2,4,0,0,0};
        int m = 3;
        int[] nums2 = {1,5,6};
        int n = 3;
        merge(nums1, m, nums2 , n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int size = m+n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[size--] = nums1[i--];
            } else {
                nums1[size--] = nums2[j--];
            }
        }

        while (j >= 0){
            nums1[size--] = nums2[j--];
        }


        for (int k : nums1) {
            System.out.println(k);
        }
    }
}
