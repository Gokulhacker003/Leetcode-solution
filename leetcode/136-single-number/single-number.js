/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let freq = new Map();

    // Count frequency
    for (let num of nums) {
        freq.set(num, (freq.get(num) || 0) + 1);
    }

    // Find the number with frequency 1
    for (let [key, value] of freq) {
        if (value === 1) {
            return key;
        }
    }
};