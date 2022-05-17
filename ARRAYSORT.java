package WEEK3DAY1JAVA;

import java.util.Arrays;

public class ARRAYSORT {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,9,8,7,6,10};
		//int len = arr.length;
		Arrays.sort(arr);//arrange the values in ascending order
		for (int i=0;i<arr.length;i++)
		{
			System.out.print( arr[i]+ ",");
		}
		System.out.println("");
		System.out.println("reverse sort");

	for (int i = arr.length-1;i>=0;i--)
		{

		
			System.out.print( arr[i]+"," );
}
	
}
}