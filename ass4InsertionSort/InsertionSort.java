//Implement insertion sort.

package com.session7.ass4InsertionSort;

public class InsertionSort {
public static int[] doInsertionSort(int[] myArray)
{
	//int [] sortedArray= new int[myArray.length];
	for (int i=0;i<myArray.length;i++)
	{
		//int temp = i;
		for (int j=0;j<i;j++)
		{
			if (myArray[i]<myArray[j])
			{
				 int temp = myArray[i];
				 myArray[i]=myArray[j];
				 myArray[j]=temp;
			}
		}
	}
	
	return myArray;
}

public static void main(String[] arg)
{
	int [] unsortArray = {6,2,5,1,8,0};
	int [] sortArray;
	sortArray=doInsertionSort(unsortArray);
	System.out.println("Sorted array is ");
	for (int i=0;i<sortArray.length;i++)
	{
		System.out.print(sortArray[i]+",");
	}
}
}
