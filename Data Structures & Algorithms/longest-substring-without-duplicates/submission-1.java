class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet win=new HashSet<>();
        int maxlen=0;
        int l=0;

        for (int r=0;r<s.length();r++){
            while(win.contains(s.charAt(r))){
                win.remove(s.charAt(l));
                l++;
            }
            win.add(s.charAt(r));
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
