class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int left = 1;
        int right = x/2;
        int temp = 0;
        while(left<=right){
            int mid = left+(right-left)/2;
            long sq = (long) mid * mid;
            if(sq>x){
                right = mid-1;
            }
            else if(sq<x){
                temp = mid;
                left = mid+1;
            }
            else return mid;
        }
        return temp;
    }
}