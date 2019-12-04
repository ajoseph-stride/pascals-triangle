public class PascalsTriangleGenerator {
    public int[][] generateTriangle(int i) {
        if (i == 0) {
            return new int[][]{};
        }

        int[][] pascal = new int[i][];

        for (int row = 0; row < i; row++) {
            pascal[row] = new int[row + 1];
            pascal[row][0] = 1;
        }

        return pascal;
    }
}