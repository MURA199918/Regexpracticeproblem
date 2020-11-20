package regexpracticeproblem;
import java.util.*;

public class regex {
    public static void main(String args[]) {
    	System.out.println("Enter user name");
    	Scanner sc=new Scanner(System.in);
    	String name=sc.nextLine();
    	if(name.matches("^[A-Z][A-Z a-z]{3,25}$")) {
    		System.out.println("Valid first name");
    	}
    	else {
    		System.out.println("Invalid first name");
    	}
    }

}
