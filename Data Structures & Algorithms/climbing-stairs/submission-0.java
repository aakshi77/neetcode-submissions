class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;

        int twostepsbefore=1;
        int onestepbefore=2;
        int totalways=0;

        for(int i=3;i<=n;i++){
            totalways=twostepsbefore+onestepbefore;

            twostepsbefore=onestepbefore;
            onestepbefore=totalways;
        }
        return totalways;
    }
}
