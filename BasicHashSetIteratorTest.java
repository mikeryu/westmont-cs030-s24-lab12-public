/**
 * Westmont College Spring 2025
 * CS 030 Lab 12, Task 2
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class BasicHashSetIteratorTest {

  private static BasicHashSet set1;
  private static BasicHashSet set2;

  @BeforeAll
  static void setUp() {

    set1 = new BasicHashSet();
    set2 = new BasicHashSet();

    for (int i = 0; i < 10; i++) set1.add(i);
    for (int i = 0; i < 1000; i++) set2.add(i);
  }

  @Test
  void iterator_set1() {
    Iterator<Object> iter = set1.iterator();
    for (int i = 0; i < 10; i++) {
      assertEquals(i, iter.next());
    }

    assertThrows(NoSuchElementException.class, iter::next);
  }

  @Test
  void iterator_set2() {
    Iterator<Object> iter = set2.iterator();
    for (int i = 0; i < 1000; i++) {
      assertEquals(i, iter.next());
    }

    assertThrows(NoSuchElementException.class, iter::next);
  }
}