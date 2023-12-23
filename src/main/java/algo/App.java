package algo;

import java.util.Arrays;

import algo.sort.BubbleSort;

public class App 
{
    public static void main( String[] args ) {

        int[] nums = new int[]{0,5,7,6,1,8,9,4,3,2};

        BubbleSort bs = new BubbleSort();

        System.out.println(Arrays.toString(bs.sort(nums)));

    }
}
