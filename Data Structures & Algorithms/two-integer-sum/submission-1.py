class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
       seen={}
       for index,i in enumerate(nums):
        needednum=target-i

        if needednum in seen:
            return [seen[needednum],index]

        seen[i]=index

