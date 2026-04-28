class Solution {
    public boolean isAnagram(String s, String t) {
        char[] schar=s.toCharArray();
        char[] tchar=t.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);

        if(Arrays.equals(schar,tchar)){
            return true;
        }

        return false;

    }
}
