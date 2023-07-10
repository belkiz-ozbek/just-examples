package stackwithlinkedlist;


public class Main {
    
    
    public static void main(String[] args) {
        
        StackWithLinkedList stack = new StackWithLinkedList(5);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.print();
    }
    
    
}
