class MyHashSet {

    ArrayList<Integer> arr=new ArrayList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        arr.add(key);
    }
    
    public void remove(int key) {
        int count=0;
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)==key){
                arr.remove(i);
            }
        }   
        }
    
    public boolean contains(int key) {
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == key){
                return true;
            }
        }

        return false;
    }
}
