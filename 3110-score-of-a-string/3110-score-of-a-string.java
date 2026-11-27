class Solution {
    public int scoreOfString(String s) {
        int n =s.length();
        int score =0;
        
        // for(int i=0;i<n-1;i++){
        //     // int ch =s.charAt(i);
        //     score += Math.abs(s.charAt(i)-s.charAt(i+1));
        // }
        int i=0;
        while(i<n-1){
            score +=Math.abs(s.charAt(i) - s.charAt(i+1));
            i++;
        }
        return score;
    }
}