import java.util.Scanner;
public class average {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int total = 0;
		int gradecounter = 1;
		
		while (gradecounter <= 10)
		{
			System.out.print("enter grade:");
			int grade =input.nextInt();
			total = total + grade;
			gradecounter = gradecounter +1;
		} 
		
		int average = total/10;
		
		System.out.printf("%n total of all 10 grades is %d%n, total");
		System.out.printf("class average is %d%n, average");
	}

}
