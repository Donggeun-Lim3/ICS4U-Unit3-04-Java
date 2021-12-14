/*
* This program pushes and prints a stack.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2021-12-10
*/

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
* This class contains the contents of a stack.
*
* @param <T> generic type class
*/
public class MrCoxallStack<T> {

    /** ArrayList signifying a stack. */
    private ArrayList<T> stackAsArray = new ArrayList<T>();

    /**
    * Pushes the input into the stack.
    *
    * @param pushElement element to push
    */
    public void push(final T pushElement) {
        this.stackAsArray.add(0, pushElement);
    }

    /**
    * Removes the top element in the stack.
    *
    * @return the removed element
    * @throws EmptyStackException if the stack is empty
    */
    public T pop() {
        if (stackAsArray.size() == 0) {
            throw new EmptyStackException();
        }
        else {
            return this.stackAsArray.remove(0);
        }
    }

    /**
    * Returns the top element in the stack.
    *
    * @return the first element
    * @throws EmptyStackException if the stack is empty
    */
    public T peek() {
        if (stackAsArray.size() == 0) {
            throw new EmptyStackException();
        }
        else {
            return this.stackAsArray.get(0);
        }
    }

    /** Clears the stack. */
    public void clear() {
        this.stackAsArray.clear();
    }

    /** Prints out the stack. */
    public void showStack() {
        this.stackAsArray.forEach(System.out::println);
    }
}

