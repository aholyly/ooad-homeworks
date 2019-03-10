package part3;

/**
 * An iterator class
 */
public interface Iterator {
    /**
     * Returns true if the iteration has more elements.
     * @return true if the iteration has more elements
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     * @return the next element in the iteration
     */
    Object next();
}
