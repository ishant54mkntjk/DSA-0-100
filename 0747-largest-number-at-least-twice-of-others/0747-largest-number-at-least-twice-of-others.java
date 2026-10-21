class Solution {
    public int dominantIndex(int[] nums) {
        int n =nums.length;
        int max1 =nums[0];
        int max2 =-1;
        int index =0;
        for(int i=0;i<n;i++){
            if(nums[i]>max1){
                max2 =max1;
                max1=nums[i];
                index =i;
            }
            else if(nums[i]<max1 && nums[i]>max2){
                max2 =nums[i];
            }
            
        }
        if(max1 >= max2*2){
             return index;    
        }
        else{
           return -1;
        }
              
    }
}