class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length()!=t.length()) return false;

    // //    HashMap <Character, Integer> map =new HashMap<>();
    //     int n =s.length();
    //     int m =t.length();
        
    //     int freq1[] =new int[26];
    //     int freq2[] =new int[26];

    //     for(int i=0;i<n;i++){
    //         freq1[s.charAt(i)-'a']++;
    //     }
    //     for(int i=0;i<n;i++){
    //         freq2[t.charAt(i)-'a']++;
    //     }
    //   boolen match =false;
    //     for(int k=0;k<n;k++){
    //         freq1[k] != freq2[k];
    //         return false;
    //     }
    //     return true;
    // this frequency way don't works for that question
    
     HashMap<Character,Character> mapST =new HashMap<>();
     HashMap<Character,Character> mapTS = new HashMap<>();

     for(int i=0;i<s.length();i++){

        char a =s.charAt(i);
        char b=t.charAt(i);

        if(mapST.containsKey(a) && mapST.get(a)!=b){
            return false;
        }
        if(mapTS.containsKey(b) && mapTS.get(b)!=a){
            return false;
        }
        mapST.put(a,b);
        mapTS.put(b,a);
     }
       return true;
    }
}