package Core;

import java.util.Scanner;

/*
	- Array is group of element with same DataType.
	- Array index is start from the 0.
	
	- There are 2 type of array.
		1. Single Dimensional.
		2. Multi Dimensional.
 */

public class Array {
	public static void main(String[] args) {
		
//		int b = 13;
//		System.out.println(b);
//		
//		int a[] = {45,656,534,3,30,2,345,545};
//		for(int index =0; index <a.length; index ++) {
//			System.out.println("Value at array index " + index + " Is " + a[index]);
//		}
	
	int index, sum=0;	
	System.out.println("Ente the size of array: ");
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	
	int ar[] = new int[size];
	for(index=0; index<ar.length; index++) {
		System.out.print("enter element at [" + index + "] is: ");
		ar[index] = sc.nextInt();
	}
	
	System.out.println("==== Final Array ====");
	for(index=0; index<ar.length; index++) {
		System.out.println("enter element at [" + index + "] is: "+ ar[index]);
	}
	

	System.out.println("### qwe ### ");
	
	System.out.println("search operation =====");
	System.out.println("enter number to search in array : ");
	int num = sc.nextInt();
	
	int counter = 0;
	for (index = 0; index < ar.length; index++) {
		if (num == ar[index]) {
			counter++;
		}
	}
	
	if(counter>0) {
		System.out.println("yes exist "+counter+" times");
	}
	else {
		System.out.println("not exist");
	}

				
	}
}
