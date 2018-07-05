public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(4);
        myStack.push(4);
        myStack.push(5);
        myStack.push(7);
        myStack.push(9);
        System.out.println("size of stack after push" + myStack.size());
        System.out.println("Pop  element from stack:");
        while (!myStack.isEmpty()) {
            System.out.printf(" %d",myStack.pop());
        }
        System.out.println("\n Size ò stack after pop operations: "+myStack.size());
    }
}
