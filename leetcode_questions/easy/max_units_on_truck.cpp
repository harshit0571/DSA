class Solution {
public:
    int maximumUnits(vector<vector<int>>& arr, int truckSize) {
        for(int i=0;i<arr.size();i++){
           swap(arr[i][0], arr[i][1]);
        }
        sort(arr.begin(), arr.end());
        int box=0;
        for(int i=arr.size()-1;i>=0;i--){
            
            if(arr[i][1]<= truckSize){
                box+=(arr[i][0]*arr[i][1]);
                truckSize-=arr[i][1];
                cout<<truckSize<<" ";
            }
            else{
                box+=arr[i][0]*(truckSize);
                return box;
            }
        }
    return box;
    }
};
