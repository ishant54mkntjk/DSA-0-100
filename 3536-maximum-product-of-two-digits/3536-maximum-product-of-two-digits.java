class Solution {
    public int maxProduct(int n) {
        // int product=1;
        int maxx =-1;
        int secondmax =-1;
        while(n>0){
            int q =n%10;
            if(q>maxx){
                secondmax=maxx;
                maxx=q;
                
            }
           else {
            if(q>secondmax){
                secondmax=q;
            }
            
           }
        //    product=maxx*secondmax;
            n =n/10;
        }

        return maxx*secondmax;
    }
}