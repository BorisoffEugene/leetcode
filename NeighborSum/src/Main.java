public class Main {
    public static void main(String[] args) {
        NeighborSum neighborSum = new NeighborSum(new int[][] {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}});

        System.out.println(neighborSum.adjacentSum(1));
        System.out.println(neighborSum.adjacentSum(4));
        System.out.println(neighborSum.diagonalSum(4));
        System.out.println(neighborSum.diagonalSum(8));

        NeighborSum neighborSum1 = new NeighborSum(
                new int[][] {{1, 2, 0, 3}, {4, 7, 15, 6}, {8, 9, 10, 11}, {12, 13, 14, 5}}
        );

        System.out.println(neighborSum1.adjacentSum(15));
        System.out.println(neighborSum1.diagonalSum(9));
    }
}