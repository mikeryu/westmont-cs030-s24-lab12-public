/**
 * Westmont College Spring 2025
 * CS 030 Lab 12, Task 1 and 2
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 * @author TODO: add your name and email here.
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Basic implementation of set using a hash table with separate chaining implementation.
 * Supports only {@code size}, {@code add}, and {@code contains} operations (i.e., no {@code remove}).
 */
public class BasicHashSet implements Iterable<Object> {

  public static final int DEFAULT_CAPACITY = 10;
  public static final double LOAD_FACTOR_LIMIT = 0.75;

  private Node[] buckets;
  private int size;

  /**
   * Default constructor. Initializes the number of buckets to {@link BasicHashSet#DEFAULT_CAPACITY}.
   */
  public BasicHashSet() {
    // TODO: Your implementation here.
  }

  /**
   * Returns the number of elements in this HashSet.
   * @return number of elements
   */
  public int size() {
    return 0;  // TODO: Your implementation here.
  }

  /**
   * Adds the given {@link Object} to this HashSet if it does not already exist in the set.
   * @param o {@link Object} to add
   */
  public void add(Object o) {
    // TODO: Your implementation here.
  }

  /**
   * Performs a membership check of the {@link Object} given in this HashSet with constant (O(1)) time performance.
   * @param o {@link Object} to check the membership in this set
   * @return {@code true} if the given object is in this set, {@code false} otherwise
   */
  public boolean contains(Object o) {
    return false; // TODO: Your implementation here.
  }

  /**
   * OPTIONAL private helper method to use for growing the `buckets` array size
   * when the load factor limit is reached or exceeded, doubling its size (2x).
   */
  private void growBuckets() {
    // TODO: Add your implementation here, or, if unused, leave empty.
    // HINT: Use `isOverloaded` helper method.
  }

  /**
   * OPTIONAL private helper method to use for adding a given Object to any arbitrary bucket array.
   * @param bucketArr bucket array assumed to be the backing structure for separate chaining implementation
   * @param o Object to add
   */
  private void addToBucket(Node[] bucketArr, Object o) {
    // TODO: Add your implementation here, or, if unused, leave empty.
    // HINT: Use this method in both `add` and `growBuckets` method.
  }

  /**
   * OPTIONAL private helper method to determine whether the load factor of the hash table
   * has reached or exceeded the limit defined by `LOAD_FACTOR_LIMIT` constant.
   * @return {@code true} if limit reached or exceeded, {@code false} otherwise.
   */
  private boolean isOverLoaded() {
    return false;  // TODO: Add your implementation here, or, if unused, leave as `return false`.
                   // HINT: Use this method in `growBuckets` helper method.
  }

  @Override
  public Iterator<Object> iterator() {
    return null; // TODO: Add your implementation here to return the BasicHashTableIterator instance.
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < buckets.length; i++) {
      sb.append(String.format("B[%d] - ", i));
      Node curr = buckets[i];

      while (curr != null) {
        sb.append(String.format("%s - ", curr.data));
        curr = curr.next;
      }

      sb.append("null\n");
    }

    return sb.toString();
  }

  private class Node {
    public Object data;
    public Node next;
  }

  private class BasicHashTableIterator implements Iterator<Object> {

    private Node chainPtr = null;  // chain cursor
    private int bucketPtr = -1;    // bucket cursor

    @Override
    public boolean hasNext() {
      return false;  // TODO: Your implementation here.
                     // HINT: Use `hasNextNodeInChain` and `hasNextOccupiedBucket` (if implemented).
    }

    @Override
    public Object next() {
      return null;  // TODO: Your implementation here.
                    // HINT: Use `advancePointers` here (if implemented).
    }

    private boolean hasNextNodeInChain() {
      return false; // TODO: Your implementation here, or, if unused, leave as `return false`.
                    // HINT: There is another Node in chain if both `chainPtr`
                    //       itself and its `next` reference of it are non-null.
    }

    private boolean hasNextOccupiedBucket() {
      return false; // TODO: Your implementation here, or, if unused, leave as `return false`.
                    // HINT: Advance `bucketPtr` to linearly search for an occupied bucket;
                    //       if the `bucketPtr` exceeds the capacity of `buckets`, return false.
    }

    private void advancePointers() {
      // TODO: Your implementation here, or, if unused, leave empty.
      // HINT: If `chainPtr` is already pointing to a Node in a chain, advance it,
      //       and if the end of the chain is reached, call `advanceBucketPointer`.
      //       Otherwise, simply call `advanceBucketPointer` only.

    }

    private void advanceBucketPointer() {
      // TODO: Your implementation here, or, if unused, leave empty.
      // HINT: Advance `bucketPtr` as long as it's within range and buckets are unoccupied.
      //       When the iteration stops, if it's still within range, set `chainPtr` to the Node there.
      //       If `bucketPtr` is out of range when the loop exists, throw NoSuchElementException.
    }
  }
}
