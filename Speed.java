//program to calculate fuel estimation
//anish
//230970044
//09-01-2024

import java.util.Scanner;

class Speed
{
	public static void main(String args[])
	{
		float dist_Km,fuel_Litre,avg_Eco;
		int choice;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the distance in km");
		dist_Km=scanner.nextFloat();
		System.out.println("Enter the Fuel economy");
		fuel_Litre=scanner.nextFloat();
		avg_Eco=(float)dist_Km/fuel_Litre;
		System.out.println("Avreage Fuel economy ="+avg_Eco+" kmpl");
		do
		{
			System.out.println("1.Dist Estimation\n2.Fuel Estimation");
			System.out.println("Enter your choice(0 to stop)");
			choice=scanner.nextInt();
			switch(choice)
			{
				case 1:System.out.println("Enter fuel consumed in litre");
						float fuel_Est=scanner.nextFloat();
						float dist_Est=(float)fuel_Est*avg_Eco;
						System.out.println("estimated distance="+dist_Est+" km");
						break;
				case 2:System.out.println("Enter distance");
						float dist_Travel=scanner.nextFloat();
						float fuel_Req=(float)dist_Travel/avg_Eco;
						System.out.println("estimated Fuel="+fuel_Req+" Litre");
						break;
				default:System.out.println("Invalid chocie");
						break;


			}
			System.out.println("Do u want to continue");
			choice=scanner.nextInt();

		}while(choice!=0);



	}
}