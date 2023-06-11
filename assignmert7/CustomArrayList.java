package assignmert7;



import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] items;
    private int size;

    public CustomArrayList() {
        items = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(T item) {
        ensureCapacity(size + 1);
        items[size++] = item;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        checkBounds(index);
        return (T) items[index];
    }

    @Override
    public boolean add(int index, T item) {
        checkBoundsForAdd(index);
        ensureCapacity(size + 1);
        System.arraycopy(items, index, items, index + 1, size - index);
        items[index] = item;
        size++;
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index) {
        checkBounds(index);
        T removedItem = (T) items[index];
        int numShifted = size - index - 1;
        if (numShifted > 0) {
            System.arraycopy(items, index + 1, items, index, numShifted);
        }
        items[--size] = null;
        return removedItem;
    }

    private void ensureCapacity(int minCapacity) {
        if (items.length < minCapacity) {
            int newCapacity = items.length * 2;
            items = Arrays.copyOf(items, newCapacity);
        }
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
    }

    private void checkBoundsForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
    }
}