class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        strList = list(s);
        strList2 = list(t);
        strList.sort();
        strList2.sort();
        return strList == strList2;