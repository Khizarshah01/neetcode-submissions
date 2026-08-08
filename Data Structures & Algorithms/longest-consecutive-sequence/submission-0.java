class Solution {
    public int longestConsecutive(int[] nums) {
        Map <Integer,Boolean> map = new HashMap<>();

        int longestlen = 0;
        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],false);
        }

        for(int i = 0; i<nums.length; i++){
            int currentlength = 1;

            int nextnum = nums[i] + 1;
            while(map.containsKey(nextnum) && map.get(nextnum)==false)
            {
                currentlength++;
                map.put(nextnum,true);
                nextnum++;
            }

            int prevnum = nums[i] - 1;
            while(map.containsKey(prevnum) && map.get(prevnum)==false)
            {
                currentlength++;
                map.put(prevnum,true);
                prevnum--;
            }
            longestlen = Math.max(longestlen,currentlength);
        }
        return longestlen;
    }
}
