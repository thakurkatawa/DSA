class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> inset=new HashSet<>();

        for(int i=0;i<nums.length;i++){
             int num = nums[i];
            if(inset.contains(num))
                return true;

                inset.add(num);
            
            

        }
        return false;
    }
}