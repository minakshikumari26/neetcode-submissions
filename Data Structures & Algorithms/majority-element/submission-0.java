class Solution {
    public int majorityElement(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int c : nums){
            set.add(c);
        } 
        for(int num : set){
            for(int i = 0;i<nums.length;i++){
                if(num == nums[i]){
                    count++;
                }
            }
            if(count>(nums.length)/2){
                return num;
            }
        }
        return count;
    }
}