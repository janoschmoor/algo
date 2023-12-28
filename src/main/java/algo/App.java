package algo;

import java.util.Arrays;

import algo.graph.UnionFind;
import algo.search.BinarySearch;
import algo.search.SearchAlg;
import algo.sort.BubbleSort;
import algo.sort.InsertionSort;
import algo.sort.MergeSort;
import algo.sort.SortAlg;

public class App 
{
    public static void main( String[] args ) {

        int[] test = new int[]{9,5,2,8,1,4,7,3,6,0};
        //int[] test = new int[]{1,0,3};

        System.out.println(Arrays.toString(test));

        InsertionSort s = new InsertionSort();
        s.sort(test);

        System.out.println(Arrays.toString(test));
        

    }
}
