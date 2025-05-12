//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

// User function Template for C++

int countDigits(int n) {

    // write your code here
    
    // return number of digits in n
    int count=0;
    while(n>0){
        n=n/10;
        count++;
    }
    return count;
}


//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;
        cout << countDigits(n);
        cout << endl;

        cout << "~"
             << "\n";
    }
}
// } Driver Code Ends