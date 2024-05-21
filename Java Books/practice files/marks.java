import java.util.Scanner;
class marks
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			if(x >= 90)
	    		{
			System.out.println("\n Grade A+");
			}
			else if(x >= 80 && x < 90)
	    		{
			System.out.println("\n Grade A");
			}
			else if(x >= 70 && x < 80)
	   		{
			System.out.println("\n Grade B+");
			}
			else if(x >= 60 && x < 70)
	    		{
			System.out.println("\n Grade B");
			}
			else if(x >= 50 && x < 60)
	    		{
			System.out.println("\n Grade C");
			}
			else 
	    		{
			System.out.println("\n Fail");
			} 	
		}
}