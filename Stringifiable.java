/**
 * Westmont College Spring 2024
 * CS 030 Lab 12, Task 2
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

/**
 * Implementing this interface allows an ADT composed of nodes/vertices and edges to provide
 * specific {@link String} representation of the structure for displaying to a console output.
 */
public interface Stringifiable {

  /**
   * Returns a {@link String} representation of the data structure using
   * either <i>post-order</i> or <i>pre-order</i> traversal algorithm.
   *
   * @param isPreorder {@code true} if <i>pre-order</i> traversal should be used,
   *                   {@code false} <i>post-order</i> traversal should be used instead
   * @return {@link String} representation of this data structure in the specified order
   */
  String traverse(boolean isPreorder);

  /**
   * Returns a {@link String} representation of the process of performing a <i>depth-first search</i>
   * (DFS) through this data structure to find the {@code target} object passed in. Instead of throwing
   * any exception for a failed search, the {@link String} representation of the structure will indicate
   * that the {@code target} was not found after searching through the entire structure in DFS order.
   *
   * @param target object to find in this structure using DFS
   * @return {@link String} representation of the DFS process including whether the {@code target} was found
   */
  String dfs(Object target);

  /**
   * Returns a {@link String} representation of the process of performing a <i>breadth-first search</i>
   * (BFS) through this data structure to find the {@code target} object passed in. Instead of throwing
   * any exception for a failed search, the {@link String} representation of the structure will indicate
   * that the {@code target} was not found after searching through the entire structure in BFS order.
   *
   * @param target object to find in this structure using BFS
   * @return {@link String} representation of the BFS process including whether the {@code target} was found
   */
  String bfs(Object target);
}
