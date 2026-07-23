class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0].toString();
        }
        StringBuilder sb = new StringBuilder();

        int minLength = strs[0].length();
        for(String s:strs){
            minLength = Math.min(minLength,s.length());
        }
        for(int i = 0;i<minLength;i++){
            for(int j = 1;j<strs.length;j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}