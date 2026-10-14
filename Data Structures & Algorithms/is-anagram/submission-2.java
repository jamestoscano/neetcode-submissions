class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> seen1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            seen1.put(s.charAt(i), seen1.getOrDefault(s.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> seen2 = new HashMap<>();

        for (int i = 0; i < t.length(); i++){
            seen2.put(t.charAt(i), seen2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return seen1.equals(seen2);

    }
}
