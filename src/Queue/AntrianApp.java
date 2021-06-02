package Queue;

public class AntrianApp {
    public static void main(String[] args) {
        Antrian newQueue = new Antrian(10);
        newQueue.enqueue(40);
        newQueue.show();
        newQueue.enqueue(33);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
        newQueue.enqueue(60);
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.show();
        newQueue.enqueue(54);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
    }
}
