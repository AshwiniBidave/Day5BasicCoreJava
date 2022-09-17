import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		double sum = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		int number=s.nextInt();        
        for (int i = 1; i <= number; i++)
        {
            sum = sum + (double)1 / i;
        }
       System.out.println("nsum=" + sum);
	}

}
