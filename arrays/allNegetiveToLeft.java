lass Solution {
    
    public void segregateElements(int arr[], int n)
    {
        int p=0;
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans.add(arr[i]);
            }
            else{
                ans2.add(arr[i]);
            }
        }
        for(int i=0;i<ans2.size();i++){
            arr[p]=ans2.get(i);
            p++;
        }
        for(int i=0;i<ans.size();i++){
            arr[p]=ans.get(i);
            p++;
        }
        
        
        
    }
}
