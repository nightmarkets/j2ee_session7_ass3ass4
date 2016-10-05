//Implement selection sort.
//we repeatedly find the next largest (or smallest) element in the array and
//move it to its final position in the sorted array.

package com.session7.ass3SelectionSort;

public class SelectionSort {

	public static int[] doSelectionSort (int[] myArray)
	{
		for (int i=0;i< (myArray.length-1);i++)
		{
			int index = i;
			for (int j=i+1;j<myArray.length;j++)
			{
				if (myArray[j]<myArray[index])
				{
					int temp = myArray[index];
					myArray[index]=myArray[j];
					myArray[j]=temp;
				}
			}
		}
	return myArray;
	}
	
	public static void main (String[] arg)
	{
		int[] unsortArray = {3,1,2,9,0};
		int[] sortArray;
		sortArray=doSelectionSort(unsortArray);
		
		System.out.println("The sorted array is: ");
		for (int i=0;i<sortArray.length;i++)
		{
			System.out.print(sortArray[i]+",");
		}
		
	}
}
