package labAss1;
import java.util.*;

public class CreateAccount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("REGISTRATION FORM");
		System.out.print("Enter first name: ");
		String fn = sc.nextLine();
		System.out.print("Enter last name: ");
		String ln = sc.nextLine();
		System.out.print("Enter email: ");
		String em = sc.nextLine();
		System.out.print("Enter address: ");
		String ad = sc.nextLine();
		System.out.print("Enter phone: ");
		String ph = sc.nextLine();
		
		System.out.print("Enter age: ");
		int ag = 0;
		if (sc.hasNextLine()) {
		    String age = sc.nextLine();
		    if (age.isEmpty()) {}
			else {
	            if (age.matches("^[1-9]\\d*$")) {
	            	ag = Integer.parseInt(age);
	            }
		        else {
	                System.out.print("[Invalid age. Registration failed.]");
	                System.exit(0);
	            }
           	}     
	    }
        
		Account acc = new Account.AccountBuilder()
				.firstName(fn)
				.lastName(ln)
				.email(em)
				.address(ad)
				.phone(ph)
				.age(ag)
				.build();
		
		System.out.println();
		System.out.println("-> You've successfully created an account!");
		System.out.println("Here are your details:");
		System.out.println("First name: "+acc.firstName);
		System.out.println("Last name: "+acc.lastName);
		System.out.println("Email: "+acc.email);
		System.out.println("Address: "+acc.address);
		System.out.println("Phone: "+acc.phone);
		System.out.print("Age : ");
		if (acc.age > 0) {
            System.out.print(acc.age);
        }  	
	}
}
