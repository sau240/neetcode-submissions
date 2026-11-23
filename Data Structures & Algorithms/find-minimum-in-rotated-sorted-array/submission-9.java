class Solution {
    public int findMin(int[] nums) {
        ArrayList<Integer> result  = new ArrayList<>();

        if(nums == null|| nums.length == 0) {
            throw new IllegalArgumentException("Must not be empty ..  ");
        }

        int min = nums[0];
        for(int i = 1; i < nums.length; i ++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    } 
}
