public class Main {
    public static void main(String[] args) {
        System.out.println(findCenter(new int[][] {{1,2},{2,3},{4,2}}));
        System.out.println(findCenter(new int[][] {{1,2},{5,1},{1,3},{1,4}}));
    }

    public static int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) return edges[0][0];
        if (edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]) return edges[0][1];

        return -1;
    }
}