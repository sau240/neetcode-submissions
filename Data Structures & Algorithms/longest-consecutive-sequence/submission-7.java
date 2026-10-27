class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if (nums == null || nums.length == 0)
            return 0;
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentSum = num;
                int currentStreak = 1;

                while (set.contains(currentSum + 1)) {
                    currentStreak++;
                    currentSum++;
                }
                max = Math.max(max, currentStreak);
            }
        }
        return max;
    }
}
