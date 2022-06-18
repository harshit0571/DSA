// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

// class Solution {
// public:
//     int finalValueAfterOperations(vector<string>& operations) {
//         map<string, int> mp;
//         mp={{"X++",1},{"++X", 1},{"X--", -1},{"--X",-1}};
//         int x=0;
//         for(int i=0;i<operations.size();i++){
//             x=x+mp[operations[i]];
//         }
//         return x;
//     }
// };