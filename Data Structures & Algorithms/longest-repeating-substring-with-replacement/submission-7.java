class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int length = 0;
        int freq = 0;

        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            count[idx]++;
            freq = Math.max(freq, count[idx]);

            while ((right - left + 1) - freq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            length = Math.max(length, right - left + 1);
        }

        return length;
    }
}