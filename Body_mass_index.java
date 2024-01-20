
import java.util.Scanner;
class Body_mass_index
{
	public static void main(String args[])
	{
		float body_Weight,body_Height,body_Bmi;

		Scanner scanner=new Scanner(System.in);
		System.out.println("***BMI Calculator***");
		System.out.println("Enter your body weight in kilograms");
		body_Weight=scanner.nextFloat();
		System.out.println("Enter your body height in centimeters");
		body_Height=scanner.nextFloat();
		body_Height=body_Height/100;
		body_Bmi=(float)body_Weight/(body_Height*body_Height);
		System.out.println("BMI="+body_Bmi);
		if(body_Bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(body_Bmi>=18.5&&body_Bmi<=24.9)
		{
			System.out.println("Normal");
		}
		else if(body_Bmi>=25&&body_Bmi<=29.9)
		{
					System.out.println("overweight!");
		}
		else
		{
			System.out.println("obese");
		}
	}
}
