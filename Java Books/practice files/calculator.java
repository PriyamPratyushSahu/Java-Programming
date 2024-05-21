import java.util.Scanner;

class calculator{

    public static void main(String[] args) {

    	double x, y;
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter 2 numbers");
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double output;
        switch(operator)
        {
            case '+':
            	output = x + y;
                break;

            case '-':
            	output = x - y;
                break;

            case '*':
            	output = x * y;
                break;

            case '/':
            	output = x / y;
                break;
            default:
                System.out.printf("error");
                return;
        }

        System.out.println(x+" "+operator+" "+y+": "+output);
    }
}