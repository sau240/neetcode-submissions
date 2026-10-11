class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Convert strings to character arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        // Sort both arrays alphabetically
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        // Check if the sorted arrays are exactly the same
        return Arrays.equals(sChars, tChars);
    }
}