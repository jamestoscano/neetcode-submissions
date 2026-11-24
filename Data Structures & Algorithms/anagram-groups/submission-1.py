class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = {}

        for anagram in strs:
            newStr = sorted(anagram)
            newStr = "".join(newStr)
            thisList = []

            if newStr not in res:
                thisList.append(anagram)
                res[newStr] = thisList
            else:
                res[newStr].append(anagram)
        
        return list(res.values())