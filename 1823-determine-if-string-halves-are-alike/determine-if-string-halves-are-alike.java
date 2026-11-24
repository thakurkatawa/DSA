class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        int count1 =0;
        int count2=0;
        s=s.toLowerCase();
        for(int i=0;i<mid;i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                count1++;
            }
        }
        for(int i=mid;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                count2++;
            }

        }
        return count1==count2;

    }
}