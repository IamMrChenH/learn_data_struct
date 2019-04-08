package 队列;

class MyCircularQueue {

    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(4);
        queue.enQueue(10);
        queue.enQueue(9);
        queue.deQueue();
        queue.enQueue(8);
        queue.enQueue(7);
        queue.enQueue(6);


        int max = queue.size;
        for (int i = 0; i < max; i++) {
            System.out.println(queue.Front());
            queue.deQueue();
        }

    }


    int data[];
    int head, tail, size, preTail;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = 0;
        tail = 0;
        size = 0;

    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) return false;
        if (isEmpty()) {
            head = 0;
            tail = 0;
            size = 0;
        }


        data[tail] = value;
        preTail = tail;
        size++;
        tail = (tail + 1) % data.length;


        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) return false;

        head = (head + 1) % data.length;
        size--;

        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return isEmpty() ? -1 : data[head];

    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        return isEmpty() ? -1 : data[preTail];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return size == data.length;
    }
}
