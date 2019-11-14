package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fiveStrings = {"Zero", "One","Two", "Three", "Four"};
		//2. print the third element in the array
		System.out.println("Thrid Element");
		System.out.println(fiveStrings[2]);
		//3. set the third element to a different value
		System.out.println("New Thrid Element Value");
		fiveStrings[3]="Different Value";
		//4. print the third element again
		dSystem.out.println(fiveStrings[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<fiveStrings.length;i++) {
		     System.out.println(fiveStrings[i]);
		}
		//6. make an array of 50 integers
		int[] manyInts = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i=0;i<manyInts.length;i++) {
		    Random r = new Random(); 
		    int rNum = r.nextInt(50);
		    manyInts[i] = rNum;
			System.out.println(manyInts[rNum]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int small = 50;
		for (int i=0;i<manyInts.length;i++) {
			if (manyInts[i]<small) {
				small = manyInts[i];
		   }
		}
		System.out.println(small);
		//9 print the entire array to see if step 8 was correct
		for (int i=0;i<manyInts.length;i++) {
		     System.out.println(manyInts[i]);
		}

		//10. print the largest number in the array.
		int big = 0;
		for (int i=0;i<manyInts.length;i++) {
			if (manyInts[i]>small) {
				big = manyInts[i];
		   }
		}
	}
}
