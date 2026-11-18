class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // Shrink window from the left until the duplicate is removed
            while (window.contains(current)) {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(current);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}