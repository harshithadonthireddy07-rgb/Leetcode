class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        res=""
        n=len(word1)
        m=len(word2)
        for i in range(min(m,n)):
            res+=word1[i]
            res+=word2[i]
        if m>n:
            res+=word2[n:]
        elif n>m:
            res+=word1[m:]
        return res
    

        