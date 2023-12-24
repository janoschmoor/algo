package algo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import algo.search.BinarySearch;
import algo.sort.BubbleSort;
import algo.sort.MergeSort;


/**
 * Unit test for simple App.
 */
public class AppTest {


    
    @Test
    public void BubbleSort() {
        for (int i = 0; i < 100; i++) {
            assertTrue(isSorted(new BubbleSort().sort(getRandomIntArray())));
        }
    }
    @Test
    public void MergeSort() {
        for (int i = 0; i < 100; i++) {
            assertTrue(isSorted(new MergeSort().sort(getRandomIntArray())));
        }
    }

    @Test
    public void BinarySearch() {
        for (int i = 0; i < 100; i++) {
            int[] A = getRandomSortedIntArray();
            int index = (int) Math.floor(Math.random() * A.length);
            assertEquals(index, new BinarySearch().search(A, A[index]));
        }
    }

    
    // HELPER Functions

    public int[] getRandomSortedIntArray() {
        int[] r = getRandomIntArray();
        return new MergeSort().sort(r);
    }

    public int[] getRandomIntArray() {
        int[] r = new int[(int) Math.round(Math.random() * 100 + 10)];
        for (int i = 0; i < r.length; i++) {
            r[i] = (int) Math.round(Math.random() * 2 * Integer.MAX_VALUE - Integer.MAX_VALUE);
        }
        return r;
    }
    public boolean isSorted(int[] A) {
        if (A.length == 0) return true;
        int v = A[0];
        for (int i = 1; i < A.length; i++) {
            if (v > A[i]) {
                return false;
            }
            v = A[i];
        }
        return true;
    }
}
