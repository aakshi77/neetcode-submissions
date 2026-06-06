class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        int longeststreak=0;
        for(int num:s){
            if(!s.contains(num-1)){
                int curr=num;
                int currstreak=1;
            

            while(s.contains(curr+1)){
                curr++;
                currstreak++;
            }
            longeststreak=Math.max(longeststreak,currstreak);
        }
        }
        return longeststreak;
    }
}
