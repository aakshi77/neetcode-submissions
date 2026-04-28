class Solution {
    public boolean isPalindrome(String s) {
        // An empty string is considered a valid palindrome.
        if (s == null || s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // 1. Move the left pointer forward if it's not an alphanumeric character.
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue; // Skip the rest of the loop and start the next iteration.
            }

            // 2. Move the right pointer backward if it's not an alphanumeric character.
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            // 3. Compare the two characters (case-insensitive).
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false; // If they don't match, it's not a palindrome.
            }

            // 4. Move both pointers inward to check the next pair.
            left++;
            right--;
        }

        // If the loop completes, the string is a palindrome.
        return true;
    }
}