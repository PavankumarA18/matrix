package Matrixaddition;
import java.util.Scanner;

public class MatrixAddition 
{
	public static void main (String[] args) 
  {
	    int i, j;
	    int[][] a = new int[3][3];
	    int[][] b = new int[3][3];
	    int[][] c = new int[3][3];
	    Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements of 1st array row-wise :\n");
		for(i = 0; i < 3; i++)
		{
		    for(j =0; j < 3; j++)
		    {
		        a[i][j] = s.nextInt();
		    }
		}
		System.out.println("Enter the elements of 2nd array row-wise :\n");
		for(i = 0; i < 3; i++)
		{
		    for(j = 0; j < 3; j++)
		    {
		        b[i][j] = s.nextInt();
		    }
		}
		for(i = 0; i < 3; i++)
		{
		    for (j = 0; j < 3; j++)
		    {
		        c[i][j] = a[i][j] + b[i][j];
		    }
		}
		System.out.println("The resulting array is : ");
		for (i = 0; i < 3; i++)
		{
		    for (j = 0; j < 3; j++)
		    {
		        System.out.println(" " + c[i][j] + " ");
		    }
		    System.out.println("\n");
		}
	}
}
