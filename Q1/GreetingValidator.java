package labtest03;
import java.util.*;
public class GreetingValidator {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=1;
		System.out.print("Name : ");
		String name=scan.next();
		System.out.print("Age  : ");
		int age=scan.nextInt();
		try {
			InputException(age);
		}
		catch(InvalidInputException e) {
			System.out.println("Error:"+e);
			i++;
		}
		catch(Exception e) {
			System.out.println("Error:"+e);
			i++;
		}
		finally{
			if(i==1) {
				System.out.println("Hello "+ name +" you are "+ age+ " Years old.");
			}
		}
		scan.close();
	}
	public static void InputException(int a) throws InvalidInputException{
		if(a>120) {
		throw new InvalidInputException("Invalid age: Age should be a positive integer less than or equal to 120");
	}}
	
}

@SuppressWarnings("serial")
class InvalidInputException extends Exception{
	public InvalidInputException(String message) {
		super(message);
	}
}
