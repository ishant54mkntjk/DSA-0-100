class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freq =new HashMap<>();

        for(char ch :s.toCharArray()){
           freq.put(ch, freq.getOrDefault(ch,0)+ 1 );
        }
         int res =0;
         boolean hasodd=false;
        for(int val:freq.values()){
            
            if(val%2==0){
               res +=val;
            }
            else{
                res +=val -1;
                hasodd=true;
            }
        }
        if(hasodd) res++;

        // int n =s.length();
        // int freq[] =new int[52];
        // for (char ch : s.toCharArray()) {
        //     if (ch >= 'a' && ch <= 'z') {
        //         freq[ch - 'a']++;
        //     } else {
        //         freq[ch - 'A' + 26]++;
        //     }
        // }
        // int res=0;
        // boolean hasodd=false;
        // for(int i=0;i<52;i++){
        //     int val =freq[i];
        //     if(val%2==0){
        //        res +=val;
        //     }
        //     else{
        //         res +=val -1;
        //         hasodd=true;
        //     }
        // }
        // if(hasodd) res++;
        return res;
    }
}