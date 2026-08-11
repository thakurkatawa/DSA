class Solution {
    public List<String> removeAnagrams(String[] words) {

        List<String> ans = new ArrayList<>();
        String previous = "";

        for (String word : words) {

            String current = getSignature(word);

            if (!current.equals(previous)) {
                ans.add(word);
                previous = current;
            }
        }

        return ans;
    }

    private String getSignature(String word) {

        int[] freq = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        return Arrays.toString(freq);
    }
}