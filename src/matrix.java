import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = scanner.nextInt();
        System.out.println("Enter column: ");
        int column = scanner.nextInt();

        double[][] matrix = new double[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Property list: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        double max = matrix[0][0];
        int indexRow = 1;
        int indexColumn = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    indexColumn = j + 1;
                    indexRow = i + 1;
                }
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position row " + indexRow +" ,at position column " + indexColumn );
    }
}
