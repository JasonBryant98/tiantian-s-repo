package catCatchFish;

import java.util.ArrayList;

public class Queue {
     ArrayList<Integer> data = new ArrayList();
     int head;
     int tail;


     @Override
     public String toString() {
          return "Queue{" +
                  "data=" + data +
                  ", head=" + head +
                  ", tail=" + tail +
                  '}';
     }


}
