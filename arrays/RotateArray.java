
class Compute {
    void reverse(int arr[], int s, int e){
        while(s<e){
            int temp=0;
            temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
    }
    
    public void rotate(int arr[], int n)
    {
        int k=1;
     reverse(arr, 0, arr.length-1);
     reverse(arr,0,k-1);
     reverse(arr,k, arr.length-1);
        
    }
}
