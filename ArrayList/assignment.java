import java.util.NoSuchElementException;
import java.lang.IllegalArgumentException;
import java.lang.IndexOutOfBoundsException;

/**
 * Your implementation of an ArrayList.
 */
public class ArrayList<T> {

    /*
     * The initial capacity of the ArrayList.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 9;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new ArrayList.
     * 
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayList() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }
    
    private void addAtIndex(int index, T data){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if(data == null) {
            throw new IllegalArgumentException();
        } else {
            if(size + 1 > backingArray.length) {
                T[] tempArray = backingArray;
                backingArray = (T[]) new Object[backingArray.length * 2];
                for(int i=0; i< tempArray.length; i++){
                   backingArray[i] = tempArray[i];
                }
            }
            
            if(index == 0) {
                for(int i = size; i > 0; i--){
                    backingArray[i] = backingArray[i-1];
                }
                backingArray[0] = data;
            } else if (index == size){
                backingArray[size] = data;
            }
            size++;
        }
    }

    /**
     * Adds the data to the front of the list.
     *
     * This add may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        addAtIndex(0, data);        
    }

    /**
     * Adds the data to the back of the list.
     *
     * Method should run in amortized O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        addAtIndex(size, data);
    }

    private T removeAtIndex (int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();    
        } else {
            // remove from the back
            if (index == size - 1){
                T temp = backingArray[--size];
                backingArray[size] = null;
                return temp;
            } else {
            // remove from anywhere else
                T temp = backingArray[index];
                for (int i=index; i< size-1; i++){
                    backingArray[i] = backingArray[i+1];
                }
                backingArray[--size]=null;
                return temp;
            }
        }
    }    
        
    /**
     * Removes and returns the first data of the list.
     *
     * Do not shrink the backing array.
     *
     * This remove may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        return removeAtIndex(0);
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Do not shrink the backing array.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        return removeAtIndex(size); 
    }

    /**
     * Returns the backing array of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}
