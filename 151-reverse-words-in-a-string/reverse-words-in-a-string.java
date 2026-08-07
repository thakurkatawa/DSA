class Solution {
    public String reverseWords(String s) {
        int start=0;
        int end=s.length()-1;

        String[] words = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            
            ans.append(words[i]);

            if(i!=0){
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}