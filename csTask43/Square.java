/**
 * Define a Square class with methods to create and read in
 * info for a square matrix and to compute the sum of a row,
 * a col, either diagonal, and whether it is magic.
 */
import java.util.Scanner;
public class Square
{
    private int[][] square;
    private int dim;

    /** Create new square of given size */
    public Square(int size)
    {
        square = new int[size][size];
        dim = size;
    }

    /** Return the sum of the values in the given row */
    public int sumRow(int row)
    {
        int sum = 0;
        for (int c = 0; c < dim; c++)
            sum += square[row][c];
        return sum;
    }

    /** Return the sum of the values in the given column */
    public int sumCol(int col)
    { 
        int sum = 0;
        for (int r = 0; r < dim; r++)
            sum += square[r][col];
        return sum;
    }

    /** Return the sum of the values in the main diagonal */
    public int sumMainDiag()
    {
        int sum = 0;
        for (int i = 0; i < dim; i++)
            sum += square[i][i];
        return sum;
    }

    /** Return the sum of the values in the other diagonal */
    public int sumOtherDiag()
    {
        int sum = 0;
        for (int i = 0; i < dim; i++)
            sum += square[square.length - 1 - i][i];
        return sum;
    }

    /** Return true if the square is magic (all rows, cols, and diags have
     *  same sum), false otherwise */
    public boolean magic()
    {
        if (sumRow(0) == sumCol(0) && sumMainDiag() == sumOtherDiag() && sumRow(0) == sumMainDiag())
            return true;
        else
            return false;
    }

    /** Read info into the square from the input stream associated with the
     *  Scanner parameter */
    public void readSquare(Scanner scan)
    {
        for (int row = 0; row < dim; row++)
            for (int col = 0; col < dim; col ++)
                square[row][col] = scan.nextInt();
    }

    /** Print the contents of the square, neatly formatted */
    public void printSquare()
    {
        for (int row = 0; row < dim; row++)
        {
            System.out.print("\n");
            for (int col = 0; col < dim; col++)
                System.out.print(square[row][col] + "\t");
        }
    }
}
