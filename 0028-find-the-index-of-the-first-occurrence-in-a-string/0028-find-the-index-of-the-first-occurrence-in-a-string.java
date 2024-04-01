class Solution {
    public int strStr(String haystack, String needle) {
         if (needle.isEmpty()) {
            return 0; 
        }
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 1;
                while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }
                if (j == m) {
                    return i; 
                }
            }
        }
        return -1;
    }
}