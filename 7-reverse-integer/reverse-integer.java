class Solution {
    public int reverse(int x) {
      int revnum=0;
      boolean isnegative= x<0;



        while(x!=0){

            int ld=x%10;
        
            
            x=x/10;
            if (revnum > Integer.MAX_VALUE / 10 ||
                (revnum == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0;
            }

            // Check for underflow
            if (revnum < Integer.MIN_VALUE / 10 ||
                (revnum == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0;
            }
            revnum=(revnum*10)+(ld);

        }  
       
        return revnum;
    }
}