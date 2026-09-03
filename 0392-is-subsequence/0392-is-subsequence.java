class Solution {
    public boolean isSubsequence(String s, String t) {
        
        // for(int i=0;i<s.length();i++){
        //     for(int j=0;j<t.length();j++){
        //         if(s.charAt(i) == t.charAt(j)){
        //             return true;
        //         }
        //     }
        // }
        int i=0;
        int j=0;
        while(j<t.length() && i<s.length()){
            if(s.charAt(i)== t.charAt(j)){
                i++;
            }
            j++;
            
        } 
        if(i == s.length()){
            return true;
            }
        return false;
    }
}