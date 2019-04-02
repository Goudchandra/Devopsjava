import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		int a, b, sum;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Numbers : ");
        a = scan.nextInt();
        b = scan.nextInt();
		
        sum = a + b;
		
        System.out.print("Sum of the Entered Two Number is " +sum);

	}

}