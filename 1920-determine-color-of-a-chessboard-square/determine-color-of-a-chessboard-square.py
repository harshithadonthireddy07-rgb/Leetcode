class Solution:
    def squareIsWhite(self, coordinates: str) -> bool:
        num1=int(coordinates[1])
        num2=ord(coordinates[0])-ord('a')
        if (num1+num2)%2==0:
            return True
        return False