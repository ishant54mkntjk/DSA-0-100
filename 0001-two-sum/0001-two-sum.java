class Solution {
    public int[] twoSum(int[] nums, int target) {
     int n =nums.length;
    //  int sum=0;
     
//////// For sorted array
    //  int i=0;
    //  int j=n-1;
    // // Arrays.sort(nums);
    // //  int result =new int();
    //  while(i<j){
    //         sum =nums[i]+nums[j];
    //         if(sum == target){
    //             return new int[]{i,j};
            
    //         }
    //         else if(sum>target){
    //            j--;
    //         }
    //         else{
    //             i++;
    //         }
    //     }
     
    //  return new int[]{-1,-1};

////////////////    
    //  int[] result =new int[2];
    //  for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         sum =nums[i]+nums[j];
    //         if(sum == target){
    //             result[0] =i;
    //             result[1]=j;
    //             return result;   
    //             // return new int[]{i,j};        
    //         }
    //         }
    //     }   
    // //  return new int[]{-1,-1}; 
    //             result[0] =-1;
    //             result[1]=-1;
    //             return result; 


    HashMap<Integer,Integer> map =new HashMap<>();

    for(int i =0;i<n;i++){
        int com =target-nums[i];

        if(map.containsKey(com)){
            return new int[]{map.get(com),i};
        }

        map.put(nums[i],i);
    }
    return new int[]{-1,-1};
    }
}