package regexpracticeproblem;
import java.util.*;

public class regex {
    public static void main(String args[]) {
    	System.out.println("Enter user name");
    	Scanner sc=new Scanner(System.in);
    	String firstname=sc.nextLine();
    	if(firstname.matches("^[A-Z][A-Z a-z]{3,25}$")) {
    		System.out.println("Valid first name");
    	}
    	else {
    		System.out.println("Invalid first name");
    	}
    	
    	System.out.println("Enter last name");
    	String lastname=sc.nextLine();
    	if(lastname.matches("^[A-Z][A-Z a-z]{3,25}$")) {
    		System.out.println("Valid last name");
    	}
    	else {
    		System.out.println("Invalid last name");
    	}
    	
    	System.out.println("Enter email id");
    	String email=sc.nextLine();
    	if(email.matches("^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$")) {
    		System.out.println("valid email address");
    	}
    	else {
    		System.out.println("Invalid email address");
    	}
    	
    	System.out.println("Enter phone number");
    	String phone=sc.nextLine();
    	if(phone.matches("[91 ]{3}[789]{1}\\d{9}")) {
    		System.out.println("Valid phone number");
    	}
    	else {
    		System.out.println("Invalid phone number");
    	}
    	
    	System.out.println("Enter password");
    	String password=sc.nextLine();
    	if(password.matches("[0-9a-zA-Z]{8,}")) {
    		System.out.println("Valid password");
    	}
    	else {
    		System.out.println("Invalid password");
    	}
    	
    	/*int var=1;
    	while(var==1) {
    		System.out.println("Var 1 to continue and others to exit");
    		var=sc.nextInt();
    		if(var==1) {
    			System.out.println("Enter email id");
    			String emailid=sc.next();
    			String pattern=
    		}
    	}
    	*/
    	
    }

}
