class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        
        // for(int i=0;i<n;i++){
        //     int count =0;
        //     for(int j=0;j<n;j++){
        //          if(nums[i]==nums[j]){
        //             count++;
        //          }
              
        //     }
        //     if(count == 1){
        //         return nums[i];
        //     }
            
        // }
        // return -1;

    //     for(int i=0;i<n;i++){
    //         if(i>0 && nums[i]==nums[i-1]){
    //             continue;
    //         }
    //         if(i<n-1 && nums[i] == nums[i+1]){
    //             continue;
    //         }
    //         return nums[i];
    //     }
    //  return -1;

    int low=0;
    int high =n-1;
    while(low<high){
        int mid =low +(high-low)/2;

        if(mid%2==1){
            mid--;
        }
        if(nums[mid]==nums[mid+1]){
            // means single value is in right
            low =mid+2;
        }
        else{
            // means single value is in left
            high =mid;
        }
    }
    return nums[low];
    }
}