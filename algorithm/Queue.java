import java.util.Arrays;

public class Queue {
   private int[] data = new int[100];

   private int head;

   private int tail;

    public int[] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }
}
