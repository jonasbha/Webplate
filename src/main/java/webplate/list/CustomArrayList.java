package webplate.list;

import webplate.exception.EmptyCollectionException;

import java.util.Arrays;

/**
 * ArrayList represents an array implementation of a list. The front of
 * the list is kept at array index 0.
 */
public class CustomArrayList<T>
{
    private final static int DEFAULT_CAPACITY = 100;

    protected int rear;
    protected T[] list;

    /**
     * Creates an empty list using the default capacity.
     */
    public CustomArrayList()
    {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty list using the specified capacity.
     *
     * @param initialCapacity the integer value of the size of the array list
     */
    public CustomArrayList(int initialCapacity)
    {
        rear = 0;
        list = (T[])(new Object[initialCapacity]);
    }

    /**
     * Creates a new array to store the contents of this list with
     * twice the capacity of the old one. Called by descendant classes
     * that add elements to the list.
     */
    protected void expandCapacity()
    {
        list = Arrays.copyOf(list, list.length*2);
    }

    protected void removeAllItems() {

        if (isEmpty())
            throw new EmptyCollectionException("ArrayList");

        while (!isEmpty()) {
            rear--;
            list[rear] = null;
        }
    }

    /**
     * Removes the last element in this list.
     *
     * @throws EmptyCollectionException if the element is not in the list
     */
    protected void removeLastItem() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("ArrayList");

        rear--;
        list[rear] = null;
    }

    /**
     * Returns a reference to the element at the rear of this list.
     * The element is not removed from the list. Throws an
     * EmptyCollectionException if the list is empty.
     *
     * @return a reference to the last element of this list
     * @throws EmptyCollectionException if the list is empty
     */
    public T getLast() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("ArrayList");

        return list[rear-1];
    }

    protected T get(int index) throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("ArrayList");

        return list[index];
    }

    /**
     * Returns true if this list is empty and false otherwise.
     *
     * @return true if the list is empty, false otherwise
     */
    protected boolean isEmpty()
    {
        return (rear == 0);
    }

    /**
     * Returns the number of elements currently in this list.
     *
     * @return the number of elements in the list
     */
    public int size()
    {
        return rear;
    }

    /**
     * Returns a string representation of this list.
     *
     * @return the string representation of the list
     */
    public String toString()
    {
        StringBuilder result = new StringBuilder();

        for (int scan=0; scan < rear; scan++)
            result.append(list[scan]).append("\n");

        return result.toString();
    }

    /**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the list
     */
    protected void addToRear(T element)
    {
        if (size() == list.length)
            expandCapacity();

        list[rear] = element;
        rear++;
    }
}