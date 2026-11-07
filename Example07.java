import java.util.Arrays;
import java.util.EmptyStackException;




class ArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        top = 0;
        stack = (T[]) new Object[initialCapacity];
    }

    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }
        stack[top] = element;
        top++;
    }

    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int capacity() {
        return stack.length;
    }
}


public class Example07 { public static void main(String[] args) { System.out.println("Example 7: implementation classes are ready to use."); } }
