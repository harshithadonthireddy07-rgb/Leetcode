class Solution:
    def reverseWords(self, s: str) -> str:
        res=s.split()
        ans=""
        for i in res:
            ans=ans+i[::-1]+" "
        return ans.strip()
        