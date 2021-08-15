// Given an array of non-negative integers, sort the elements of the array in the increasing order of their cardinality. The cardinality of an integer can be defined as the number of 1's in it's binary representation.

// For example, 2 = 10, so its cardinality is 1 and similarly if we look for, say, 12 = 1100, its cardinality would be 2.

// The output should be an integer array with elements in the increasing order of cardinality and the elements with the same cardinality should also be sorted in ascending fashion.

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
        for(int i : nums){
            if(!map.containsKey(cardinality(i))) map.put(cardinality(i), new ArrayList<Integer>());
            map.get(cardinality(i)).add(i);
        }
        int index = 0;
        for(int i=0; i<=32; i++){
            if(!map.containsKey(i)) continue;
            for(int num : map.get(i)) result[index++] = num;
        }
        return result;
    }
}
