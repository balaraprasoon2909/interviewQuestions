class Solution{
    public int cardinality(int num){
        int result = 0;
        while(num != 0){
            if((num&1) != 0) result++;
            num >>= 1;
        }
        return result;
    }
    
    public int[] cardinalitySorting(int[] nums){
        if(nums.length < 2) return nums;
        int[] result = new int[nums.length];
        Arrays.sort(nums);
        Map<Integer, List<Integer>> map = new HashMap<>();
        
    }
}
