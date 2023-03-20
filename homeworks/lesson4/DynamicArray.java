package homeworks.lesson4;

import java.util.Arrays;

public class DynamicArray<T extends Comparable<T>> {
    
    private T[] storage;
    private int size;

    public DynamicArray() {
        this.storage = (T[]) new Comparable[10];
        this.size = 0;
    }

    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Некорректное значение: " + capacity);
        }
        this.storage = (T[]) new Comparable[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + this.size);
        }
        return this.storage[index];
    }

    public void set(int index, T item) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + this.size);
        } 
        this.storage[index] = item;
    }

    public void add(T item) {
        if (this.size == this.storage.length) {
            int newLength = this.storage.length * 2;
            this.storage = Arrays.copyOf(this.storage, newLength);
        }
        this.storage[this.size++] = item;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + this.size);
        }
        if (this.size == this.storage.length) {
            int newLength = this.storage.length * 2;
            this.storage = Arrays.copyOf(this.storage, newLength);
        }
        System.arraycopy(this.storage, index, item, index + 1, this.size - index);
        this.storage[index] = item;
        this.size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + this.size);
        }
        int numMoved = this.size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(this.storage, index + 1, this.storage, index, numMoved);
        } 
        this.storage[--this.size] = null;
    }

    public int indexOf(T item) {
        if (item == null) {
            for (int i = 0; i < this.size; i++) {
                if (this.storage[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (item.equals(this.storage[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public void sort() {
        Arrays.sort(this.storage, 0, this.size);
    }

    @Override
    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.size - 1; i++) {
            sb.append(this.storage[i]).append(", ");
        }
        sb.append(this.storage[this.size - 1]).append("]");
        return sb.toString();
    }
}