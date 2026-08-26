class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n= score.length;
        // Arrays.sort(score, Collections.reverseOrder());
        
        // for(int ch:score){
        // int max =ch[1];
        // int max2 =ch[2];
        // int max3 =ch[3];
        //     if(i>3){
        //         ch[i] =i;
        //     }
        // }
        // for(int j=0;j<n;j++){
        //     if(score[i]==max) return "Gold Medal";
        //     else if(score[i]==max2) return "Silver Medal";
        //     else if(score[i]==max3) return "Bronze Medal";
        //     else{
        //     return i;
        //     }
        // }

        // create a  array which stores final output of contain integer and string
        String[] ans =new String[n];

        // Create a duplicate area of score
        int[] sorted  =score.clone();

        // sort 
        Arrays.sort(sorted);
           
           // HashMap for store value
           HashMap<Integer, String> map =new HashMap<>();

           for(int i=n-1;i>=0;i--){
               int val =n-i;
               if(val == 1){
                map.put(sorted[i], "Gold Medal");
               }
               else if(val ==2){
                map.put(sorted[i], "Silver Medal");
               }
               else if(val == 3){
                map.put(sorted[i], "Bronze Medal");
               }
               else{
                map.put(sorted[i], String.valueOf(val));
               }
           }

           for(int k=0;k<n;k++){
            ans[k] = map.get(score[k]);
           }
        return ans;
    }
}