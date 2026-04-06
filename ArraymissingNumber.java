import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {   
        
        Arrays.sort(nums);   // sort the array
        // check from 0 to n
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;   // missing number found
            }
        }
        
        // if all elements are correct, missing is n
        return nums.length;
    }
}
