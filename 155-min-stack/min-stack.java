class MinStack {
Stack<Long> s = new Stack<>();
long minval;
    public MinStack() {

    }
    
    public void push(int value) {
                if(s.isEmpty()){
            s.push((long)value);
            minval=value;
        }
        else{
            if(value<minval){
                s.push(2L*value-minval);
                minval=value;
            }
            else{
                s.push((long)value);
            }
        }
    }
    
    public void pop() {
        if(s.peek()<minval){
            minval=2L*minval-s.peek();
        }
        s.pop();
    }
    
    public int top() {
        if(s.peek()<minval){
            return (int) minval;
        }
        return s.peek().intValue();
    }
    
    public int getMin() {
        return (int )minval;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */