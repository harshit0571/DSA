class MyQueue {
    Stack<Integer> st1=new Stack<Integer>();
    Stack<Integer> st2=new Stack<Integer>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.empty()){
            st2.push(st1.peek());
            st1.pop();
        }
        int a=st2.pop();
        while(!st2.empty()){
            st1.push(st2.peek());
            st2.pop();
        }
        return a;

    }
    
    public int peek() {
        while(!st1.empty()){
            st2.push(st1.peek());
            st1.pop();
        }
        int a= st2.peek();
        while(!st2.empty()){
            st1.push(st2.peek());
            st2.pop();
        }
        return a;
    }
    
    public boolean empty() {
        if(st1.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
