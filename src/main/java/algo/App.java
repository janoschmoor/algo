package algo;

import java.util.Arrays;

import algo.search.BinarySearch;
import algo.search.SearchAlg;
import algo.sort.BubbleSort;
import algo.sort.MergeSort;
import algo.sort.SortAlg;

public class App 
{
    public static void main( String[] args ) {

        int[] nums = new int[]{0,5,7,6,1,8,9,4,3,2};

        SortAlg sort = new MergeSort();

        int[] sortednums = sort.sort(nums);

        SearchAlg alg = new BinarySearch();

        for (int i = -5; i < 15; i++) {

            System.out.println(alg.search(sortednums, i));
        }
        

    }
}
