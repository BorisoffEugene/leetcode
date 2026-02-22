import java.util.HashMap;

class NeighborSum {
    private HashMap<Integer, PointCache> map = new HashMap<>();

    private class PointCache {
        private int i = -1;
        private int j = -1;
        private int adjSum = 0;
        private int diagSum = 0;
        private int[][] grid;

        public PointCache(int i, int j, int[][] grid) {
            this.i = i;
            this.j = j;
            this.grid = grid;
        }

        private int getVal(int i, int j) {
            if (i < 0 || i >= grid.length) return 0;
            if (j < 0 || j >= grid[0].length) return 0;

            return grid[i][j];
        }

        public int getAdjSum() {
            if (adjSum == 0) adjSum = getVal(i - 1, j) + getVal(i, j + 1) + getVal(i + 1, j) + getVal(i, j - 1);
            return adjSum;
        }

        public int getDiagSum() {
            if (diagSum == 0) diagSum = getVal(i - 1, j - 1) + getVal(i - 1, j + 1) + getVal(i + 1, j + 1) + getVal(i + 1, j - 1);
            return diagSum;
        }
    }

    public NeighborSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++)
            for (int j  = 0; j < grid.length; j++)
                map.put(grid[i][j], new PointCache(i, j, grid));
    }

    public int adjacentSum(int value) {
        return map.get(value).getAdjSum();
    }

    public int diagonalSum(int value) {
        return map.get(value).getDiagSum();
    }
}