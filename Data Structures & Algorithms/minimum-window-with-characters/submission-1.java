class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int required = t.length();
        int start = 0;

        while (right < s.length()) {
            char rChar = s.charAt(right);
            if (need[rChar] > 0) {
                required--;
            }
            need[rChar]--;
            right++;

            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char lChar = s.charAt(left);
                need[lChar]++;
                if (need[lChar] > 0) {
                    required++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}