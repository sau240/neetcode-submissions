
public class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // 1. Find the delimiter '#' to extract the length prefix
            int delimiterIdx = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiterIdx));
            
            // 2. Extract the exact substring of 'length' characters after '#'
            int startIdx = delimiterIdx + 1;
            int endIdx = startIdx + length;
            decoded.add(str.substring(startIdx, endIdx));
            
            // 3. Move pointer to the start of the next length prefix
            i = endIdx;
        }
        
        return decoded;
    }
}