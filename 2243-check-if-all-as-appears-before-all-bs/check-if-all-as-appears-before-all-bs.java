class Solution {
    public boolean checkString(String s) {
        char prev=s.charAt(0);
        for(int i=1;i<s.length();i++){
                char curr=s.charAt(i);
                if(prev<=curr){
                    prev=s.charAt(i);
                    continue;
                }
                else
                {
                    return false;
                }
        }
        return true;
        
    }
}