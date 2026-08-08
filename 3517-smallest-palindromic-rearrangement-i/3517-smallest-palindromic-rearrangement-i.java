import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        char[] ans = new char[s.length()];

        int left = 0;
        int right = s.length() - 1;

        int i = 0;

        while (i < arr.length) {

            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                ans[left++] = arr[i];
                ans[right--] = arr[i];
                i += 2;
            } else {
                ans[s.length() / 2] = arr[i];
                i++;
            }
        }

        return new String(ans);
    }
}