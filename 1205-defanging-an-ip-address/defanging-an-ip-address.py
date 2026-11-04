class Solution:
    def defangIPaddr(self, address: str) -> str:
        res=""
        for i in address:
            if i=='.':
                res+='['+i+']'
            else:
                res+=i
        return res
        