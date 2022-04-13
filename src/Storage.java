import com.company.Box;

public class Storage {
    private int length;
    private int width;
    private int height;
    private int top = -1;
    private int capacity;
    private Storage[] allBoxes;
//    private Box box;

    Storage(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.capacity = 50;
        allBoxes = new Storage[capacity];
    }

    public void pushBox(Storage value) {
        allBoxes[++top] = value;
    }
}
