public class Test2 {
    public static void main(String[] args) {
        int[][] matrix =
                        {{1, 5, 6, 8, 10},
                        {2, 7, 9, 11, 13},
                        {4, 9, 14, 18, 21},
                        {5, 16, 22, 25, 28},
                        {8, 19, 24, 29, 40}};

        System.out.println(isContains(matrix, 190));
    }

    public static boolean isContains(int[][] matrix, int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
