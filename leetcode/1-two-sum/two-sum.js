/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let i,j;
    for(i=1;i<nums.length;i++){
        for(j=i;j<nums.length;j++){
            if(nums[j]+nums[j-i]===target){
                return new Array(j-i,j);
            }
        }
    }
    return new Array();
};