package WEEK3DAY1JAVA;

public class NEWARRAY {

	public static void main(String[] args) {
		int arr []= { 1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		//int len = arr.length;
		//System.out.println(len);
		//for (int i =0;i<len;i++) //for (int i =0;i<14(why not put "=" because we giving index value below in sys out;i++)
			                    //or direct formula 
		for (int i =0;i<arr.length;i++)
			                  //for (int i =0;i<=arr.length-1;i++) 
		{
			System.out.print (arr[i] +",");
			
		}
	}

}
