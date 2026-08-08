class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int n = nums.length;
        for(int x:set){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(nums[j]==x)count++;
            }
            if(count>n/3) ans.add(x);
        }
        return ans;
    }
}