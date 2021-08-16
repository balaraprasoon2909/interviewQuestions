class Solution{
    public int uniquePairs(int[] nums, int target){
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        for(int i : nums){
            if(set.contains(i) && set.contains(target-i)){
                result++;
                set.remove(i);
                set.remove(target-i);
            }
        }
        return result;
    }
}
