package diziler;

import java.util.Arrays;

public class Odev3MatrisTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4},
                         {5, 6, 4}};

        int[][] tranposeMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tranposeMatrix[j][i] = matrix [i][j];

            }
        }

        for (int i = 0; i < tranposeMatrix.length; i++) {
            for (int j = 0; j < tranposeMatrix[i].length; j++){
                System.out.print(tranposeMatrix[i][j] + "   ");
            }
            System.out.println();
        }
    }


}


