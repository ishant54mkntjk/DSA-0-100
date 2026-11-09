class Solution {
    public int maxSubArray(int[] nums) {
        int n =nums.length;
        int currentsum =0;
        int maxsum =Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            currentsum =Math.max(nums[i], currentsum + nums[i]);

            maxsum =Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
}