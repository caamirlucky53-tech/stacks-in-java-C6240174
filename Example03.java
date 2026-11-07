class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class Example03 {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<Integer>();
        box1.set(25);
        int age = box1.get();

        Box<String> box2 = new Box<String>();
        box2.set("Ali");
        String name = box2.get();

        // box1.set("Ali"); // Compile error: String is not an Integer

        System.out.println("box1 holds " + age);
        System.out.println("box2 holds " + name);
    }
}
