class Solution:
    def reverseByType(self, s: str) -> str:
        chars=list(s)
        lower=[]
        
        for i in chars:
            if i.islower():
                lower+=i 
        lower=lower[::-1]
        pos=0
        for i in range(len(chars)):
            if chars[i].islower():
                chars[i]=lower[pos]
                pos+=1 

        special=[]
        
        for i in chars:
            if not i.islower():
                special+=i 
        special=special[::-1]

        pos=0
        for i in range(len(chars)):
            if not chars[i].islower():
                chars[i]=special[pos]
                pos+=1 
        return "".join(chars)


        