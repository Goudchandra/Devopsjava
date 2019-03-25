import java.util.Scanner;
public class sub {
public static void main(String arg[]) {
int a, b, sub;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Numbers : ");
        a = scan.nextInt();
        b = scan.nextInt();
		
        sub = a - b;
		
        System.out.print("Value is " +sub);
}
}