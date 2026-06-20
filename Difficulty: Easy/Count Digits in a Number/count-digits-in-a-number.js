/**
 * @param {number} n
 * @returns {number}
 */
class Solution {
    countDigits(n) {
        // code here
        let count = 0
        while(n!=0){
            count++
            let l= n/10
            n = l - (l%1)
        }
        return count
    }
}