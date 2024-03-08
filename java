import java.util.*;

public class SnakePatternMatrix {
    public static void main(String[] args) {
        Scanner nikhil = new Scanner(System.in);
        
        int rows = nikhil.nextInt();
        int cols = nikhil.nextInt();
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = nikhil.nextInt();
            }
        }
        
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        
        nikhil.close();
    }
}
