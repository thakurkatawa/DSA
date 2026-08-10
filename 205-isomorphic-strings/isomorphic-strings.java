class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char char1 = s.charAt(i);
            char char2 = t.charAt(i);

            // Check s → t
            if (map1.containsKey(char1)) {
                if (map1.get(char1) != char2) {
                    return false;
                }
            }

            // Check t → s
            if (map2.containsKey(char2)) {
                if (map2.get(char2) != char1) {
                    return false;
                }
            }

            // Create mapping
            map1.put(char1, char2);
            map2.put(char2, char1);
        }

        return true;
    }
}