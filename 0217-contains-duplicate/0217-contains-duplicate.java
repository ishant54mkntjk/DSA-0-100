class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
            int n=nums.length;

            for(int i=0;i<n;i++){
                int comm= nums[i];

                if(map.containsKey(comm)){
                    return true;
                }

                map.put(nums[i],i);
            }
            return false;
    }
}