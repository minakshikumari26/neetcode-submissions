class Solution {
    public int calPoints(String[] words) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<words.length;i++){
            if(words[i].equals("+")){
                int top = stack.pop();
                int secondTop = stack.peek();
                int sum1 = top+secondTop;
                stack.push(top);
                stack.push(sum1);
            }
            else if(words[i].equals("C")){
                stack.pop();
            }
            else if(words[i].equals("D")){
                int ele1 = stack.peek();
                stack.push(ele1*2);
            }
            else{
                stack.push(Integer.parseInt(words[i]));
            }
        }

        while(!stack.isEmpty()){
            sum = sum+stack.pop();
        }
        return sum;
    }
}