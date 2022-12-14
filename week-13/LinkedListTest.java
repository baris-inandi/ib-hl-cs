public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> n = new LinkedList<>(2);
        n.push(3);
        n.push(4);
        n.push(5);
    }
}

class LinkedList<T> {
    public LinkedList<T> next = null;
    public T value;

    public LinkedList(T elem) {
        this.value = elem;
    }

    public void push(T elem) {
        this.next = new LinkedList<>(elem);
    }
}
