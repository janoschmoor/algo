package algo.sort;

public class MergeSort extends SortAlg {

    @Override
    public int[] sort(int[] A) {
        if (A.length == 0) return new int[0];
        return recursion(A, 0, A.length-1);
    }

    public int[] recursion(int[] A, int l, int r) {
        
        // recursive base case
        if (r - l == 0) return new int[]{A[l]};
        
        // split and sort left and right array
        int m = (l + r) / 2;
        int[] sl = recursion(A, l, m);
        int[] sr = recursion(A, m+1, r);

        int index = 0;
        int sli = 0;
        int sri = 0;
        
        int[] B = new int[r - l + 1];

        // merge sl and sr into B
        while (sli < sl.length || sri < sr.length) {

            if (sli == sl.length) {
                int temp = sr[sri];
                B[index] = temp;
                sri++;
            } else if (sri == sr.length) {
                int temp = sl[sli];
                B[index] = temp;
                sli++;
            } else if (sl[sli] > sr[sri]) {
                int temp = sr[sri];
                B[index] = temp;
                sri++;
            } else {
                int temp = sl[sli];
                B[index] = temp;
                sli++;
            }
            index++;
        }

        return B;
    }
}
