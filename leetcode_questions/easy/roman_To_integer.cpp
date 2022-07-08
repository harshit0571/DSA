class Solution {
public:
    int romanToInt(string s) {
        map<char , int> n;
        n={{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};
        int sum=0;
        for(int i=0;i<s.size();i++){
            if(n[s[i+1]]>n[s[i]]){
                sum+=n[s[i+1]]-n[s[i]];
                i++;
            }
            else{
                sum+=n[s[i]];
            }
        }
        return sum;
    }
};
