package labtest03;
import java.util.*;

@SuppressWarnings("serial")
class InvalidPhoneNumberDigits extends Exception {
	public InvalidPhoneNumberDigits(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class InvalidPhoneNumberStart extends Exception {
	public InvalidPhoneNumberStart(String message) {
		super(message);
	}
}


public class DemoApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter mobile number : ");
		String pno = scan.next();
		int i=1;
		try {
			PhoneNumberDigits(pno);
			
		}catch(InvalidPhoneNumberDigits e) {
			System.out.print("Error : "+e);
			i++;
		}
		
		try {
			PhoneNumberStart(pno);
		}
		catch(InvalidPhoneNumberStart e) {
			System.out.print("Error : "+e);
			i++;
		}
		
			if(i==1) {
				System.out.print("Validation successfull");
			}
			else {
				System.out.print("Validation fail");
			}
		
		scan.close();
	}
	
	
	
	public static void PhoneNumberDigits(String tpno) throws InvalidPhoneNumberDigits{
		if(tpno.length()!=10 ) {
		throw new InvalidPhoneNumberDigits("The phone number must have exactly 10 digits.\n");
		}
	}
	
	public static void PhoneNumberStart(String tpno) throws InvalidPhoneNumberStart{
		Character c = tpno.charAt(0);
		if (c != '0') {
			throw new InvalidPhoneNumberStart("The phone number must start with 0\n");
		}
	}
	
}
