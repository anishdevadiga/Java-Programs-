//program to calculate Fee
//anish
//230970044
//09-01-2024
import java.util.Scanner;
class Fee
{
	public static void main(String args[])

	{
		double fee=50000;
		int year=10;
		int i=1;
		double interest=fee*0.05;
		while(i<=year)
		{
			fee=fee+interest;
			System.out.println("The Fee after "+i+" year="+fee);

			i++;
		}
	}
}