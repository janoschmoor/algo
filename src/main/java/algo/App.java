package algo;

import java.util.Arrays;

import algo.graph.UnionFind;
import algo.search.BinarySearch;
import algo.search.SearchAlg;
import algo.sort.BubbleSort;
import algo.sort.MergeSort;
import algo.sort.SortAlg;

public class App 
{
    public static void main( String[] args ) {

        UnionFind uf = new UnionFind(10);

        uf.union(5, 6);
        uf.union(1, 2);
        uf.union(6, 7);

        for (int i = 1; i < 10; i++) {

            System.out.println(i-1+" to "+i+" :"+uf.connected(i-1, i));
        }
        

    }
}
