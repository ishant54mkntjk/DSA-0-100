class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        // Fix one 
        for(int i=0;i<n-2;i++){
        if(i>0 && nums[i] == nums[i-1]){
            continue;
        }

        int left =i+1;
        int right =n-1;

        // Implement two pointer
        while(left<right){
            if(nums[i]+nums[left]+nums[right]==0){
              ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
              left++;
              right--;

              while(left<right && nums[left]==nums[left-1] ){
                     left++;
              }
            while(left<right && nums[right]==nums[right+1] ){
                     right--;
              }

            }

            else if(nums[i]+nums[left]+nums[right]<0){
                left++;
            }
            else{
                right--;
            }
        }
        }
        return ans;
    }
}