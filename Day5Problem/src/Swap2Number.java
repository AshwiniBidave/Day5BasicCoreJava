import java.util.Scanner;

public class Swap2Number {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number :");
		int a=s.nextInt();
		
        System.out.println("Enter the  2nd number :");
        int b=s.nextInt();


        System.out.println("Before swap a= " + a + " b= " + b);
        a = a * b; //a=50 (5*10)      
        b = a / b; //b=5 (50/10)      
        a = a / b; //a=10 (50/5)    
        System.out.println("After swap a= " + a + " b= " + b);
	}

}
