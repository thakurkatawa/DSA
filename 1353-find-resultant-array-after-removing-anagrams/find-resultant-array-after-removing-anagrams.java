class Solution {
    public List<String> removeAnagrams(String[] words) {

        List<String> ans = new ArrayList<>();
        ans.add(words[0]);

        for (int i = 1; i < words.length; i++) {

            char[] a = ans.get(ans.size() - 1).toCharArray();
            char[] b = words[i].toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (!Arrays.equals(a, b)) {
                ans.add(words[i]);
            }
        }

        return ans;
    }
}