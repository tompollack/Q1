import java.util.Scanner;

public class QB1 
{
	
	
	public static void main(String[] args) 
	{
		int att=0;
		int comp=0;
		double yard=0;
		int touchdown=0;
		int intercept=0;
	
		Scanner scan = new Scanner(System.in);
	
		System.out.println("How many pass attempts has the QB made?\n");
		att = scan.nextInt();
	
		System.out.println("How many completions has the QB performed?\n");
		comp = scan.nextInt();
		
		System.out.println("How many passing yards has the QB thrown?\n");
		yard = scan.nextDouble();
		
		System.out.println("How many touchdown passes has the QB thrown?\n");
		touchdown = scan.nextInt();
		
		System.out.println("How many interceptions has the QB thrown?\n");
		intercept = scan.nextInt();
		
		double annu = 0;
		
		annu = ((((comp/att)*5)+((yard/att)*0.25)+((touchdown/att)*20)+(2.375-((intercept/att)*25)))/6)*100;
		System.out.println(annu + "\n");
	}

}
