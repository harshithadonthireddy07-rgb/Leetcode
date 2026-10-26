class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        count=0
        for s in range(0,len(words)):
            for i in range(s+1,len(words)):
                if words[s]==words[i][::-1]:
                    count+=1
        return count