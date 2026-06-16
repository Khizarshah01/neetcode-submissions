class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        map <int,int> mp;
        int temp;
        for (int i =0;i<nums.size();i++)
        {
            mp[nums[i]]=i+1;
        }

        for (int i = 0;i<nums.size();i++)
        {
            temp = target-nums[i];
            if(mp[temp]!=0)
            {
                if(i==mp[temp]-1)
                {continue;}
                result.push_back(i);
                result.push_back((mp[temp])-1);
            return result;
            }   
        }
        return result;
    }
};