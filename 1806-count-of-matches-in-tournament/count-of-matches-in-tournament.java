class Solution {
    public int helper(int n)
    {
        if(n==0) return 0;

        if(n%2==0)
         return n/2+helper(n/2);
        else
         return (n-1)/2+1+helper((n-1)/2);
    }
    public int numberOfMatches(int n) {
        return helper(n)-1;
    }
}