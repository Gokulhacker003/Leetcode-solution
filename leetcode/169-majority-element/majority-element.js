/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let freq = new Map();
    for(let num of nums){
        freq.set(num,(freq.get(num)||0)+1);
    }
    let ans =0,akey=0;
    for(let[key,val] of freq) {
        if(freq.get(key)>ans) {
            ans = val;
            akey = key;
        }
    }
    return akey;
};