package javacoding;

import java.util.Arrays;

public class ArrayRotator {
    
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return; // Handle edge case for null or empty array
        }
        
        k = k % nums.length; // Handle cases where k is greater than the length of the array
        
        int[] result = new int[nums.length];
        
        // Copy the last k elements to the front of the new array
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        
        // Copy the remaining elements to the new array
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }
        
        // Copy the result back to the original array
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
    
    public static void main(String[] args) {
        ArrayRotator rotator = new ArrayRotator();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(nums));
        
        rotator.rotate(nums, k);
        
        System.out.println(Arrays.toString(nums));
    }
}
