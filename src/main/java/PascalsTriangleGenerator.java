public class PascalsTriangleGenerator {
    public int[][] generateTriangle(int i) {
        int[][] pascal = new int[i][];
        for (int row = 0; row < i; row++) {
            pascal[row] = new int[row + 1];
            pascal[row][0] = 1;
            int right = pascal[row].length - 1;

            pascal[row][right] = 1;



            for(int column = 1; column < right; column++) {
                int[] previousRow = pascal[row - 1];
                pascal[row][column] = previousRow[column - 1] + previousRow[column];
            }
        }
        return pascal;
    }
}