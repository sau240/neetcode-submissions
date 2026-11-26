class Solution {
    public int reverseBits(int n) {

        int total = 0;
        for(int i = 0; i < 32; i ++) {
            total = (total << 1) | (n & 1);
            n >>>= 1;
        }
        return total;
    }
}
