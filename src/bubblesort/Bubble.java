package bubblesort;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		//Scanner S = new Scanner(System.in);
		
		System.out.print("before sorting:- ");
		int [] a = {1,2,3,4,5,6,7,8,9,10};
	
		for (int x=0;x<a.length;x++)
		{
			System.out.print(a[x] +",");
		}
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
			  if (a[i]<a[j]) {
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
			}


		}
		System.out.print(" After sorting:- ");
		for (int y=0;y<a.length;y++)
		{
			System.out.print(a[y] +",");
		}
		

	}

}
