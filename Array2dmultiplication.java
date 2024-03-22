package gani.assignments;

import java.util.Scanner;

public class Array2dmultiplication {

	public static void main(String[] args) {
		// multiplication of 2d array
		Scanner sc=new Scanner (System.in);
		int[][] a=new int[2][2];
		int[][] b=new int[2][2];
		System.out.print("enter first array elements :");
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("enter second array elements :");
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int[][] c=new int[2][2];
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				for (int k=0;k<=1;k++)
				c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
			}
		}
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
	}
	}
}

