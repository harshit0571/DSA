// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int upper=n,lower=0,mid,temp;
        while(upper>=lower){
            mid=lower+(upper-lower)/2;
            if(isBadVersion(mid)){
                temp=mid;
                upper=mid-1;
            }
            else{
                lower=mid+1;
            }
        }
        return temp;
    }
};
