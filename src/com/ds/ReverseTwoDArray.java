package com.ds;

public class ReverseTwoDArray {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}
		System.out.println(arr);
	}
}
