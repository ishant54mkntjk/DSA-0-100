class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
       int[] arr =new int[n];
        
        // for(int i=0;i<n;i++){
        //      int prefix =1;
        //      int sufix =1;
        //     for(int j=0;j<=i;j++){
        //         if(j==0){
        //             prefix =prefix;
        //         }
        //         else{
        //           prefix = prefix * nums[j-1];
        //         }
              
        //     }
        //     for(int k=n-1;k>=i;k--){
        //          if(k == n-1){
        //             sufix =sufix;
        //         }
        //         else{
        //             sufix =sufix * nums[k+1];
        //         }
                
        //     }
        //    arr[i]=prefix *sufix;
        // }
        // return arr;

        int prefix =1;
        for(int i=0;i<n;i++){
            arr[i] = prefix;
            prefix *= nums[i];
        }

        int suffix =1;
        for(int i=n-1;i>=0;i--){
            arr[i] *= suffix;
            suffix *= nums[i];
        }

        return arr;
    }
}