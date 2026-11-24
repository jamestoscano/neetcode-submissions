class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dictionary = {}

        for i in range(len(nums)):
            comp = target - nums[i]

            if nums[i] in dictionary:
                return [dictionary[nums[i]],i]

            dictionary[comp] = i
        