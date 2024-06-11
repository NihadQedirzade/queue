
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("First element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue size after dequeue: " + queue.size());
    }

}