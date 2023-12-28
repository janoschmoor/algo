package algo.sort;

public class InsertionSort extends SortAlg {
    
    @Override
    public int[] sort(int[] A) {

        for (int k = 0; k < A.length - 1; k++) {

            // sorted until the k-th element (including)

            int index = find(A[k+1], A, 0, k);

            int value = A[index];
            A[index] = A[k+1];
            
            for (int i = ++index; i < k + 2; i++) {

                int temp = A[i];
                A[i] = value;
                value = temp;
                
            }

        }

        return A;
    }

    private int find(int target, int[] A, int l, int r) {
        
        // recursive base case
        if (l == r) return (A[l] < target) ? l+1 : l ;
        
        int m = (l+r) / 2;

        if (A[m] > target) {
            return find(target, A, l, m);
        } else if (A[m] < target) {
            return find(target, A, m+1, r);
        } else {
            return m;
        }
    }

}
