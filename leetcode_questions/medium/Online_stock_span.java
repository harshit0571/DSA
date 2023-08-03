class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.pop()[1];
        }
        stack.add(new int[]{price, span});
        return span;
    }
}



/array
    class StockSpanner {
    ArrayList<Integer> arr = new ArrayList<>();    
    public int next(int price) {
        arr.add(price);
        int cnt=0;
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)<=price){
                cnt++;
            }
            else{
                break;
            }
        }
        return cnt;
    }
}
