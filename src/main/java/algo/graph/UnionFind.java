package algo.graph;

public class UnionFind {
    
    private int[] rank;
    private int[] parent;

    public UnionFind(int n) {
        rank = new int[n];
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public int find(int x) {
        while(parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return parent[x];
    }

    public void union(int x, int y) {
        // find representatives
        int xr = find(x);
        int yr = find(y);
        if (xr == yr) return;

        if (rank[xr] < rank[yr]) {
            parent[xr] = yr;
        } else if (rank[yr] < rank[xr]) {
            parent[yr] = xr;
        } else {
            parent[xr] = yr;
            rank[yr] += 1;
        }
    }
}
