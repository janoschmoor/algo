package algo.search;

public class BinarySearch extends SearchAlg {
    
    @Override
    public int search(int[] A, int v) {
        if (A.length == 0) return -1;
        return recursion(A, v, 0, A.length-1);
    }

    public int recursion(int[] A, int v, int l, int r) {
        
        int m = (l + r) / 2;

        // recursive base case
        if (A[m] == v) return m;
        if (l >= r) return -1;

        // search left or right side
        if (A[m] > v) {
            return recursion(A, v, l, m-1);
        } else {
            return recursion(A, v, m+1, r);
        }

    }

}
