class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                return new int[]{i,j};
            }
        }
         return new int[]{};
         */

        
// Hashing problem  // optimal solution 

HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
int first=nums[i];
int sec=target-first;
if(map.containsKey(sec)) return new int []{i,map.get(sec)};  // map.get() returning the value 
map.put(first,i);
}
return new int[]{};
    }
}
