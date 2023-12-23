package algo;

import java.util.Arrays;

import algo.sort.BubbleSort;
import algo.sort.MergeSort;
import algo.sort.SortAlg;

public class App 
{
    public static void main( String[] args ) {

        int[] nums = new int[]{0,5,7,6,1,8,9,4,3,2};

        SortAlg alg = new MergeSort();

        System.out.println(Arrays.toString(alg.sort(nums)));

    }
}
