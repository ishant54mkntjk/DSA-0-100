class Solution {
    public int maxNumberOfBalloons(String text) {
        int n =text.length();
        String s ="balloon";
        int freq1[]= new int [26];
        int freq2[]= new int [26];

        for(int i =0; i<n;i++){
            freq1[text.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length();i++){
            freq2[s.charAt(i)-'a']++;
        }
         
          int minnn =Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
          int res=freq1[s.charAt(i)-'a']/freq2[s.charAt(i)-'a'];
          minnn=Math.min(minnn,res);
        }
        return minnn;
    }
}