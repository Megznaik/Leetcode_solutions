class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int currentMax = nums[0];
        int globalMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}
// class Solution {
//     public int maxSubArray(int[] nums) {
//         return helper(nums, 0, nums.length - 1);
//     }

//     private int helper(int[] nums, int left, int right) {
//         if (left == right) return nums[left]; // Base case: only one element

//         int mid = left + (right - left) / 2;

//         // 1. Max subarray is entirely in the left half
//         int leftSum = helper(nums, left, mid);
        
//         // 2. Max subarray is entirely in the right half
//         int rightSum = helper(nums, mid + 1, right);
        
//         // 3. Max subarray crosses through the middle
//         int crossSum = crossMax(nums, left, mid, right);

//         // The answer is the best of the three
//         return Math.max(Math.max(leftSum, rightSum), crossSum);
//     }

//     private int crossMax(int[] nums, int left, int mid, int right) {
//         // Calculate max sum moving left from mid
//         int sum = 0;
//         int leftMax = Integer.MIN_VALUE;
//         for (int i = mid; i >= left; i--) {
//             sum += nums[i];
//             leftMax = Math.max(leftMax, sum);
//         }

//         // Calculate max sum moving right from mid + 1
//         sum = 0;
//         int rightMax = Integer.MIN_VALUE;
//         for (int i = mid + 1; i <= right; i++) {
//             sum += nums[i];
//             rightMax = Math.max(rightMax, sum);
//         }

//         return leftMax + rightMax;
//     }
// }
