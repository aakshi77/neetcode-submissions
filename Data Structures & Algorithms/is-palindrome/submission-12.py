class Solution:
    def isPalindrome(self, s: str) -> bool:

        
        val=[char.lower() for char in s if char.isalnum()]
       
        return val==val[::-1]