class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        ans=len(set(sentence))
        return ans==26