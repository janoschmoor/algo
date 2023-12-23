package algo.sort;

// 
// Sort an array by swaping pairs n^2 many times
//


public class BubbleSort extends SortAlg {
    
    @Override
    public int[] sort (int[] A) {

        // loop
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {

                // swap if pair is unordered
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
