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


public class Example11 {
    static void print(String label, Node<String> head) {
        System.out.print(label);
        Node<String> cur = head;

        for (int i = 0; i < 5 && cur != null; i++) {
            System.out.print(cur.getElement() + " -> ");
            cur = cur.getNext();
        }

        System.out.println(cur == null ? "null" : "...");
    }

    public static void main(String[] args) {
        // Correct order: link first, then move head
        Node<String> head = new Node<>("B");
        Node<String> newNode = new Node<>("A");
        newNode.setNext(head);
        head = newNode;
        print("Correct: ", head);

        // Incorrect order: B becomes unreachable and A points to itself
        head = new Node<>("B");
        newNode = new Node<>("A");
        head = newNode;
        newNode.setNext(head);
        print("Swapped: ", head);
    }
}
