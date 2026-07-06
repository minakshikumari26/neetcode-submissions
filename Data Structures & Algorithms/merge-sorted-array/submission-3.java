
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for(int i = nums1.length-1;i>=0 && count<n;i--){
            if(nums1[i]==0){
            nums1[i] = nums2[count++];
            }
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}