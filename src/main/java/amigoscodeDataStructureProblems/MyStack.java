package amigoscodeDataStructureProblems;

public class MyStack {
    private int[] stack;
    private int top;

    public MyStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        stack[++top] = value;
    }

    public int pop() {
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

}

