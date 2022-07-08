class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char t) {
        int start,end,mid,n;
        start=0;
        n=letters.size();
        end=letters.size()-1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(t<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%n];
        
    }
};


// class Solution {
// public:
//     char nextGreatestLetter(vector<char>& letters, char t) {
//         int start,end,mid;
//         start=0;
//         end=letters.size()-1;
//         while(start<=end){
//             mid = (start + (end-start))/2;
//             if(t<letters[mid]){
//                 end=mid-1;
//             }
//             else{
//                 start=mid+1;
//             }
//         }
//         return letters[start];
        
//     }
// };
