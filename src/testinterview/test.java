package testinterview;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
	    int m;  // số dòng của ma trậna
	    int n;  // số cột của ma trận
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số dòng của ma trận:");
	        m = scanner.nextInt();
	        System.out.println("Nhập vào số cột của ma trận:");
	        n = scanner.nextInt();
	    } while (m < 1 || n < 1);
	         
	    // khai báo  ma trận A  có m dòng và n cột
	    int A[][] = new int[m][n];

	         
	    System.out.println("Nhập các phần tử cho ma trận A:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print("A[" + i + "," + j + "] = ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	         

	         
	    System.out.println("Ma trận A:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(A[i][j] + "\t");

	        }
	        System.out.println("\n");
	        
	    }
	    System.out.println("4 8 6 7");
	         

	}
}
