class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap();
        int[] res = new int[2];
        int i, j, ans;
        for (i = 0; i < nums.length; i++) {
            ans = target - nums[i];
            if (hm.containsKey(ans)) {
                res[0] = hm.get(ans);
                res[1] = i;
                break;
            } else {
                hm.put(nums[i], i);
            }
        }
        return res;
    }
}
