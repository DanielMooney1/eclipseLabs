package Lab15;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;


public class VerifyRangeTest {
	public static void main( String[] args ){
		int value;
		Scanner scanner = new Scanner( System.in );
		Verifier verify = new  Verifier();
		verify.verifyIntRange(2, 1,100);
		System.out.print( "Please enter a number" );
		value = scanner.nextInt();
		System.out.println(value);
			
		 } 

		 

    
	 } 
