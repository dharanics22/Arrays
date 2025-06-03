class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        for(int i:s){
            if(!s.contains(i-1)){
                int length=1;
                while(s.contains(i+length)){
                    length++;
                }
                max=Math.max(max,length);
            }
        }
        return max;
    }
}
