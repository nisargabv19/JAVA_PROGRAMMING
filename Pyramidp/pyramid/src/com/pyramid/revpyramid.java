package com.pyramid;

public class revpyramid {
	public static void main (String[]args){
		int rows=5;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=(rows-i);j++){
               System.out.print(" "+" "); 
			}
			for(int j=1;j<=i;j++){
			System.out.print((char)(j+64)+ " ");
			}
			for(int j=i-1;j>=1;j--){
			System.out.print((char)(j+64)+ " ");
			}
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--){
			for(int j=1;j<=(rows-i);j++){
               System.out.print(" "+" "); 
			}
			for(int j=1;j<=i;j++){
			System.out.print((char)(j+64)+ " ");
			}
			for(int j=i-1;j>=1;j-- ){
			System.out.print((char)(j+64)+ " ");
			}
			System.out.println();
		}
	}
}
