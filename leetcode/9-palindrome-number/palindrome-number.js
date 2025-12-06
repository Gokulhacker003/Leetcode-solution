/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let rev=0,org=x;
    while (x!=0){
        let d = x%10;
        rev = parseInt(rev*10+d);
        x=parseInt(x/10);
    }
    
    return org >=0&&org == rev;
};