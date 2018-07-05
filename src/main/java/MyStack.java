public class MyStack{
    private int size;
    private int[] arr;
    private int indext;

    public MyStack() {

    }

    public MyStack(int size) {

        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[indext] = element;
        indext++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--indext];
    }

    public int size() {
        return indext;
    }

    public boolean isEmpty() {
        if (indext == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (indext == size) {
            return true;
        }
        return false;
    }

}
