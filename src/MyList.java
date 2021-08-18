public class MyList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new int[capacity];
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public void add(int index, int element) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            int[] newElements = new int[size * 2 + 1];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public void remove(int index) {
        int[] newElements = new int[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            if (i < index) {
                newElements[i] = elements[i];
            } else {
                newElements[i] = elements[i - 1];
            }
        }
        size--;
        elements = newElements;
    }

    public int size() {
        return this.size;
    }

    public MyList clone() {
        MyList myList = new MyList();
        myList.size = this.size;
        myList.elements = this.elements;
        return myList;
    }

    public boolean contains(int value) {
        boolean isContains = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }

    public int indexOf(int value) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int get(int index) {
        return elements[index];
    }

    public void clear() {
        size = 0;
        elements = new int[DEFAULT_CAPACITY];
    }
}
