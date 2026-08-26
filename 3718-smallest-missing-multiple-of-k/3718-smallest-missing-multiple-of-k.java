class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();

         for(int i=0;i<nums.length;i++){
             map.put(nums[i],i);
         }
        for(int i=1;i<=nums.length+1;i++){
            int mul =k*i;

            if(!map.containsKey(mul)){
                return mul;
            }
            
        }
        return -1;
    }
}