package algo.sort;

public class BubbleSort {
    
    public int[] sort (int[] A) {

        
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j-1] > A[j]) {
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
            }
        }
        return A;
    }

}
