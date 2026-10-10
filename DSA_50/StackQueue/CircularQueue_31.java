package DSA_50.StackQueue;

public class CircularQueue_31 {

    int[] queue;

    int front = -1;
    int rear = -1;
    int size;

    CircularQueue_31(int size) {

        this.size = size;

        queue = new int[size];
    }

    void enqueue(int value) {

        if ((rear + 1) % size == front) {

            System.out.println("Queue is full");

            return;
        }

        if (front == -1) {

            front = 0;
        }

        rear = (rear + 1) % size;

        queue[rear] = value;
    }

    int dequeue() {

        if (front == -1) {

            System.out.println("Queue is empty");

            return -1;
        }

        int value = queue[front];

        if (front == rear) {

            front = -1;
            rear = -1;
        } 
        else {

            front = (front + 1) % size;
        }

        return value;
    }

    public static void main(String[] args) {

        CircularQueue_31 q = new CircularQueue_31(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());

        q.enqueue(40);

        System.out.println(q.dequeue());
    }
}