class Solution:
    def firstPalindrome(self, words: list[str]) -> str:
        for i in words:
            word=i[::-1]
            if i==word:
                return i
        return ""
        