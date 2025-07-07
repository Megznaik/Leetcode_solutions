class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length, res= nums[0];
        for(int i = 0; i < n; i++){
            int cur = nums[i];
            res = Math.max(res,cur);
            for(int j = i + 1; j < n; j++){
                cur *= nums[j];
                res = Math.max(res, cur);
            }
        }
        return res;
    }
}