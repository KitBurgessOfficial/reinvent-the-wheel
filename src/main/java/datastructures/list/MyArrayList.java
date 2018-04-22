package datastructures.list;

import java.util.Arrays;

public class MyArrayList<E> implements IMyArrayList<E> {

    private E[] array;
    private int nextIndex = 0;
    private int DEFAULT_CAPACITY = 5;

    @SuppressWarnings("unchecked")
    public MyArrayList(int size) {
        array = (E[]) new String[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        // FIXME: currently only works with string
        array = (E[]) new String[DEFAULT_CAPACITY];
    }

    public E getElement(int i) {
        return array[i];
    }

    public void append(E entry) {
        array[nextIndex] = entry;
        nextIndex += 1;
    }

    public void prepend(E entry) {
        for (int i = nextIndex; i > 0 ; i--) {
            array[i] = array[i - 1];
        }
        array[0] = entry;
        nextIndex +=1;
    }

    public int size() {
        return nextIndex;
    }

    public boolean isempty() { return nextIndex == 0;}

    public E getHead() {
        return array[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}