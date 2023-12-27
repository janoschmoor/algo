package algo.sort;

public class SelectionSort extends SortAlg {
    @Override
    public int[] sort(int[] A) {
        
        for (int k = 0; k < A.length; k++) {

            int minIndex = A.length - 1;
            for (int i = k; i < A.length; i++) {
                if (A[minIndex] > A[i]) {
                    minIndex = i;
                }
            }
            int temp = A[k];
            A[k] = A[minIndex];
            A[minIndex] = temp;

        }

        return A;

    }
}
