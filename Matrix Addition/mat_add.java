import java.util.Scanner;
public class mat_add {

	public static void main(String[] args) {
		Scanner size=new Scanner(System.in);
		Scanner	input=new Scanner(System.in);
		System.out.println("MATRIX ADDITION CALCULATOR");
		System.out.println("Enter the size of the square matrices X x X: ");
		int mat_size=size.nextInt();
		int [][] mat1,mat2,final_mat;
		mat1=new int[mat_size][mat_size];
		mat2=new int[mat_size][mat_size];
		final_mat=new int[mat_size][mat_size];
		System.out.println("Enter the values for matrix 1: ");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				mat1[i][j]=input.nextInt();
			}
		}
		System.out.println("Enter the values for matrix 2: ");
		for(int i=0;i<mat2.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{
				mat2[i][j]=input.nextInt();
			}
		}
		System.out.println("Final MATRIX: ");
		for(int i=0;i<final_mat.length;i++)
		{
			for(int j=0;j<final_mat[i].length;j++)
			{
				System.out.printf("%d \t",final_mat[i][j]);
			}
			System.out.println("");
		}
	}

}
