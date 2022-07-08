class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int start,end,mid,max;
        max=arr[0];
        start=0;
        end=arr.size()-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid-1;
                max=mid;
            }else{
                start=mid+1;
                max=mid+1;
            }
        }
        return max;
        
    }
};
