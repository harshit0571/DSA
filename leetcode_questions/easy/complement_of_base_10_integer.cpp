// https://leetcode.com/problems/complement-of-base-10-integer/

// class Solution {
// public:
//     int bitwiseComplement(int n) {
//         int comp=~n;
//         int count=0;
//         int mask=0;
//         while(n!=0){
//             n>>=1;
//             mask=mask<<1 | 1;
//         }
//         return comp&mask;
//     }
// };
