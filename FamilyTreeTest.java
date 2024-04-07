/**
 * Westmont College Spring 2024
 * CS 030 Lab 12, Task 3
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 * @author TODO: add the 1st group member's info.
 * @author TODO: add the 2nd group member's info.
 * @author TODO: add the 3rd group member's info (optional).
 */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FamilyTreeTest {

  private static final String traversalPreorderSampleExpected = """
      ┌─[PREORDER TRAVERSAL]
      │
      └─┤Grandfather
        └─┤Father
          └─┤Me
            └─┤Daughter
          └─┤Brother
          └─┤Sister
        └─┤Uncle
        └─┤Aunt
      """;

  private static final String traversalPostorderSampleExpected = """
            ┌─┤Daughter
          ┌─┤Me
          ┌─┤Brother
          ┌─┤Sister
        ┌─┤Father
        ┌─┤Uncle
        ┌─┤Aunt
      ┌─┤Grandfather
      │
      └─[POSTORDER TRAVERSAL]
      """;

  private static final String dfsSampleExpectedPositive = """
      Looking for Daughter with DFS:
      ├─[DFS Order 01] Grandfather
      ├─[DFS Order 02] Father
      ├─[DFS Order 03] Me
      ├─[DFS Order 04] Daughter
      └─[DFS COMPLETE] Daughter found!
      """;

  private static final String dfsSampleExpectedNegative = """
      Looking for Oppa with DFS:
      ├─[DFS Order 01] Grandfather
      ├─[DFS Order 02] Father
      ├─[DFS Order 03] Me
      ├─[DFS Order 04] Daughter
      ├─[DFS Order 05] Brother
      ├─[DFS Order 06] Sister
      ├─[DFS Order 07] Uncle
      ├─[DFS Order 08] Aunt
      └─[DFS COMPLETE] Oppa is NOT in the tree.
      """;

  private static final String bfsSampleExpectedPositive = """
      Looking for Daughter with BFS:
      ├─[BFS Order 01] Grandfather
      ├─[BFS Order 02] Father
      ├─[BFS Order 03] Uncle
      ├─[BFS Order 04] Aunt
      ├─[BFS Order 05] Me
      ├─[BFS Order 06] Brother
      ├─[BFS Order 07] Sister
      ├─[BFS Order 08] Daughter
      └─[BFS COMPLETE] Daughter found!
      """;

  private static final String bfsSampleExpectedNegative = """
      Looking for Oppa with BFS:
      ├─[BFS Order 01] Grandfather
      ├─[BFS Order 02] Father
      ├─[BFS Order 03] Uncle
      ├─[BFS Order 04] Aunt
      ├─[BFS Order 05] Me
      ├─[BFS Order 06] Brother
      ├─[BFS Order 07] Sister
      ├─[BFS Order 08] Daughter
      └─[BFS COMPLETE] Oppa is NOT in the tree.
      """;

  private static final String traversalPreorderBritishExpected = """
      ┌─[PREORDER TRAVERSAL]
      │
      └─┤George V
        └─┤Edward VIII
        └─┤George VI
          └─┤Elizabeth II
            └─┤Charles
              └─┤William
              └─┤Harry
            └─┤Anne
              └─┤Peter
                └─┤Savannah
              └─┤Zara
            └─┤Andrew
              └─┤Beatrice
              └─┤Eugenie
            └─┤Edward
              └─┤Louise
              └─┤Severn
          └─┤Margaret
        └─┤Mary
        └─┤Henry
          └─┤Richard
        └─┤George
          └─┤Edward
          └─┤Michael
          └─┤Alexandra
        └─┤John
      """;

  private static final String traversalPostorderBritishExpected = """
        ┌─┤Edward VIII
              ┌─┤William
              ┌─┤Harry
            ┌─┤Charles
                ┌─┤Savannah
              ┌─┤Peter
              ┌─┤Zara
            ┌─┤Anne
              ┌─┤Beatrice
              ┌─┤Eugenie
            ┌─┤Andrew
              ┌─┤Louise
              ┌─┤Severn
            ┌─┤Edward
          ┌─┤Elizabeth II
          ┌─┤Margaret
        ┌─┤George VI
        ┌─┤Mary
          ┌─┤Richard
        ┌─┤Henry
          ┌─┤Edward
          ┌─┤Michael
          ┌─┤Alexandra
        ┌─┤George
        ┌─┤John
      ┌─┤George V
      │
      └─[POSTORDER TRAVERSAL]
      """;

  private static final String dfsBritishExpectedPositive = """
      Looking for Savannah with DFS:
      ├─[DFS Order 01] George V
      ├─[DFS Order 02] Edward VIII
      ├─[DFS Order 03] George VI
      ├─[DFS Order 04] Elizabeth II
      ├─[DFS Order 05] Charles
      ├─[DFS Order 06] William
      ├─[DFS Order 07] Harry
      ├─[DFS Order 08] Anne
      ├─[DFS Order 09] Peter
      ├─[DFS Order 10] Savannah
      └─[DFS COMPLETE] Savannah found!
      """;

  private static final String dfsBritishExpectedNegative = """
      Looking for Mike with DFS:
      ├─[DFS Order 01] George V
      ├─[DFS Order 02] Edward VIII
      ├─[DFS Order 03] George VI
      ├─[DFS Order 04] Elizabeth II
      ├─[DFS Order 05] Charles
      ├─[DFS Order 06] William
      ├─[DFS Order 07] Harry
      ├─[DFS Order 08] Anne
      ├─[DFS Order 09] Peter
      ├─[DFS Order 10] Savannah
      ├─[DFS Order 11] Zara
      ├─[DFS Order 12] Andrew
      ├─[DFS Order 13] Beatrice
      ├─[DFS Order 14] Eugenie
      ├─[DFS Order 15] Edward
      ├─[DFS Order 16] Louise
      ├─[DFS Order 17] Severn
      ├─[DFS Order 18] Margaret
      ├─[DFS Order 19] Mary
      ├─[DFS Order 20] Henry
      ├─[DFS Order 21] Richard
      ├─[DFS Order 22] George
      ├─[DFS Order 23] Edward
      ├─[DFS Order 24] Michael
      ├─[DFS Order 25] Alexandra
      ├─[DFS Order 26] John
      └─[DFS COMPLETE] Mike is NOT in the tree.
      """;

  private static final String bfsBritishExpectedPositive = """
      Looking for Savannah with BFS:
      ├─[BFS Order 01] George V
      ├─[BFS Order 02] Edward VIII
      ├─[BFS Order 03] George VI
      ├─[BFS Order 04] Mary
      ├─[BFS Order 05] Henry
      ├─[BFS Order 06] George
      ├─[BFS Order 07] John
      ├─[BFS Order 08] Elizabeth II
      ├─[BFS Order 09] Margaret
      ├─[BFS Order 10] Richard
      ├─[BFS Order 11] Edward
      ├─[BFS Order 12] Michael
      ├─[BFS Order 13] Alexandra
      ├─[BFS Order 14] Charles
      ├─[BFS Order 15] Anne
      ├─[BFS Order 16] Andrew
      ├─[BFS Order 17] Edward
      ├─[BFS Order 18] William
      ├─[BFS Order 19] Harry
      ├─[BFS Order 20] Peter
      ├─[BFS Order 21] Zara
      ├─[BFS Order 22] Beatrice
      ├─[BFS Order 23] Eugenie
      ├─[BFS Order 24] Louise
      ├─[BFS Order 25] Severn
      ├─[BFS Order 26] Savannah
      └─[BFS COMPLETE] Savannah found!
      """;

  private static final String bfsBritishExpectedNegative = """
      Looking for Mike with BFS:
      ├─[BFS Order 01] George V
      ├─[BFS Order 02] Edward VIII
      ├─[BFS Order 03] George VI
      ├─[BFS Order 04] Mary
      ├─[BFS Order 05] Henry
      ├─[BFS Order 06] George
      ├─[BFS Order 07] John
      ├─[BFS Order 08] Elizabeth II
      ├─[BFS Order 09] Margaret
      ├─[BFS Order 10] Richard
      ├─[BFS Order 11] Edward
      ├─[BFS Order 12] Michael
      ├─[BFS Order 13] Alexandra
      ├─[BFS Order 14] Charles
      ├─[BFS Order 15] Anne
      ├─[BFS Order 16] Andrew
      ├─[BFS Order 17] Edward
      ├─[BFS Order 18] William
      ├─[BFS Order 19] Harry
      ├─[BFS Order 20] Peter
      ├─[BFS Order 21] Zara
      ├─[BFS Order 22] Beatrice
      ├─[BFS Order 23] Eugenie
      ├─[BFS Order 24] Louise
      ├─[BFS Order 25] Severn
      ├─[BFS Order 26] Savannah
      └─[BFS COMPLETE] Mike is NOT in the tree.
      """;

  private static Stringifiable sampleFamilyTree;
  private static Stringifiable britishRoyalFamilyTree;

  @BeforeAll
  static void setUp() {
    sampleFamilyTree = null;        // TODO: Add your implementation here.
    britishRoyalFamilyTree = null;  // TODO: Add your implementation here.
  }

  @Test
  void traverseSample() {
    assertEquals(traversalPreorderSampleExpected, sampleFamilyTree.traverse(true));
    assertEquals(traversalPostorderSampleExpected, sampleFamilyTree.traverse(false));
  }

  @Test
  void dfsSample() {
    assertEquals(dfsSampleExpectedPositive, sampleFamilyTree.dfs("Daughter"));
    assertEquals(dfsSampleExpectedNegative, sampleFamilyTree.dfs("Oppa"));
  }

  @Test
  void bfsSample() {
    assertEquals(bfsSampleExpectedPositive, sampleFamilyTree.bfs("Daughter"));
    assertEquals(bfsSampleExpectedNegative, sampleFamilyTree.bfs("Oppa"));
  }

  @Test
  void traverseBritish() {
    assertEquals(traversalPreorderBritishExpected, britishRoyalFamilyTree.traverse(true));
    assertEquals(traversalPostorderBritishExpected, britishRoyalFamilyTree.traverse(false));
  }

  @Test
  void dfsBritish() {
    assertEquals(dfsBritishExpectedPositive, britishRoyalFamilyTree.dfs("Savannah"));
    assertEquals(dfsBritishExpectedNegative, britishRoyalFamilyTree.dfs("Mike"));
  }

  @Test
  void bfsBritish() {
    assertEquals(bfsBritishExpectedPositive, britishRoyalFamilyTree.bfs("Savannah"));
    assertEquals(bfsBritishExpectedNegative, britishRoyalFamilyTree.bfs("Mike"));
  }
}