import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    MyStack myStack = new MyStack(9);

    @Test
    public void TestPush() {
        myStack.push(3);
        myStack.push(7);
        myStack.push(9);
        myStack.push(45);
        myStack.push(67);
        myStack.push(35);

        int size = myStack.size();
        Assert.assertEquals(6,size);
    }
@Test
    public void TestPop() throws Exception {
    myStack.push(3);
    myStack.push(7);
    myStack.push(9);
    myStack.push(45);
    myStack.push(67);
    myStack.push(35);

        myStack.pop();
        myStack.pop();
        myStack.pop();

        int size = myStack.size();
        Assert.assertEquals(3,size);
    }

}
