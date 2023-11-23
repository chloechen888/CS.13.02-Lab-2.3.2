import java.util.Arrays;

public class CISQueue {
    private Integer[] queue;
    private int size;
    private int pointer;

    @Override
    public String toString() {
        return "CISQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", size=" + size +
                ", pointer=" + pointer +
                '}';
    }

    // Constructor.
    public CISQueue(int maxSize) {
        this.queue = new Integer[maxSize];
        this.size = 0;
        this.pointer = -1;
    }

    public int size()
    {
        return size;
    }

    public Integer dequeue() {
        if (size > 0){
            Integer dequeuedValue = queue[(pointer + 1 - size + queue.length) % queue.length];
        size--;
        reshuffle();
        return dequeuedValue;
    }
    return null;
    }

    public void enqueue(int t)
    {
        pointer = (pointer + 1) % queue.length;
        queue[pointer] = t;
        size++;
    }

    public boolean isEmpty()
    {

        return size==0;
    }

    public void reshuffle()
    {
//        if(size>0){
//        int startIndex = (pointer + 1 - size) % queue.length;
//        int endIndex = pointer;
//
//        for (int i = startIndex; i < endIndex; i++) {
//            queue[i] = queue[i + 1];
//        }
//        }
//
//        pointer = (pointer - 1) % queue.length;
////        size--;
        // IT DOENST WOWOOWOWOOWRK

        //ok now it does
        int startIndex = (pointer + 1) % queue.length;

        for (int i = startIndex; i!= pointer; i = (i + 1) % queue.length) {
            queue[i] = queue[(i + 1) % queue.length];
        }

        pointer = (pointer - 1 + queue.length) % queue.length;

    }
    }





    // Enqueue. This method adds a node to the end of the linked list.

    // Dequeue. This method removes a node from the beginning of the linked list.

    // isEmpty. Returns a boolean indicating whether the linked list is empty.

    // size. Returns the size of the queue.

    // reshuffle. Moves each element down one index. Called whenever we dequeue.

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2, pointer=1}


