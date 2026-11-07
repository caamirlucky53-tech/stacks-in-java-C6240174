import java.util.EmptyStackException;



class LinkedStack<T> {
    private int count;
    private Node<T> top;

    public LinkedStack() {
        count = 0;
        top = null;
    }

    public void push(T element) {
        Node<T> temp = new Node<>(element);
        temp.setNext(top);
        top = temp;
        count++;
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getElement();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}


public class Example13 {
    public static void main(String[] args) {
        LinkedStack<String> s = new LinkedStack<>();
        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println("size: " + s.size());
        System.out.println("peek: " + s.peek());
        System.out.println("pop: " + s.pop());
        System.out.println("size: " + s.size());
        System.out.println("peek: " + s.peek());
    }
}


class Node<T> {
    private T element;
    private Node<T> next;

    public Node() {
        element = null;
        next = null;
    }

    public Node(T element) {
        this.element = element;
        next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
