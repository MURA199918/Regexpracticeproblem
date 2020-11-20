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
    	
    	String lastname=sc.nextLine();
    	if(lastname.matches("^[A-Z][A-Z a-z]{3,25}$")) {
    		System.out.println("Valid last name");
    	}
    	else {
    		System.out.println("Invalid last name");
    	}
    }

}
