class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String anagram : strs){
            char[] sortArray = anagram.toCharArray();
            Arrays.sort(sortArray);
            String sorted = new String (sortArray);
            res.putIfAbsent(sorted, new ArrayList<String>());
            res.get(sorted).add(anagram);

        }
        return new ArrayList<>(res.values());
    }
}
