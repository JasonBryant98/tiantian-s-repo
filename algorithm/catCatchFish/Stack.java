package catCatchFish;

import java.util.ArrayList;

public class Stack {
    int top;
    ArrayList<Integer> data = new ArrayList<>();

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", data=" + data +
                '}';
    }
}
