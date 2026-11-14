class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int n =nums.length;
       Arrays.sort(nums);
       int closest =nums[0]+nums[1]+nums[2];

       for(int i=0;i<n-2;i++){
        
         
         int left =i+1;
         int right =n-1;
         while(left<right){
            int sum =nums[i]+nums[left]+nums[right];

            if(Math.abs(sum-target)<Math.abs(closest-target)){
                closest =sum;
                
            }

            if(sum == target){
                   return sum;
            }
            else if(sum>target){
                  right--;
            }
            else{
                left++;
            }
         }

       }
       return closest;
    }
}





// int  n =nums.length;
    //     ArrayList<Integer> arr = new ArrayList<>();

    //     Arrays.sort(nums);
    //     for(int i=0;i<n-2;i++){
    //        int left =i+1;
    //        int right =n-1;

    //        int sum =nums[i]+nums[left]+nums[right];
    //        arr.add(sum);

    //        Collections.sort(arr);
    //        int low =0;
    //        int high=arr.size() -1;

    //        while(low<high){
    //           int mid  =low + (high-low)/2;
    //         if(nums[mid] == target){
    //             return mid;
    //         }
    //         else if(nums[mid]>target){
    //             high =mid-1;
    //         }
    //         else{
    //             low =mid+1;
    //         }
    //        }
           
    //     }
    //    return nums[low];