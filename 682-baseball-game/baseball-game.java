class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk=new Stack<>();

        int sum=0;
        for(String op:operations)
        {
            System.out.println(op);
            if(op.equals("+"))
            {
                int prev=stk.pop();
                int secPrev=stk.peek();
                stk.push(prev);
                sum+=prev+secPrev;
                stk.push(prev+secPrev);
            }
            else if(op.equals("D"))
            {
                sum+=stk.peek()*2;
                stk.push(stk.peek()*2);
            }
            else if(op.equals("C"))
            {
                sum-=(stk.peek());
                stk.pop();
            }
            else
            {
                int num=Integer.parseInt(op);
                sum+=num;
                stk.push(num);
            }
        }
        return sum;
    }
}