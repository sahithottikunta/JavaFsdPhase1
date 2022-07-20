package assignmentMail;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ValidatingEmail {
	static boolean correctMail(String email)
	{
		String s="^(.+)@(.+)$";
		Pattern work=Pattern.compile(s);
		Matcher crt=work.matcher(email);
		return crt.matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String>req=new ArrayList<String>();
        req.add("arjun@ex.com");
        req.add("santhosh.app@ex.me.org");
        req.add("aru.ex.com");
        req.add("name..shah@ex.com");
        req.add("amit@.sham.com");
        for(String s : req)
        {
        	System.out.println("Email given "+s+" is "+(correctMail(s)?"Valid" : "Invalid"));
        }
        System.out.println("Enter an Email: ");
        try(Scanner a=new Scanner(System.in))
        {
        	String b=a.nextLine();
        	System.out.println("Email is "+b+" is "+(correctMail(b)?"Valid" : "Invalid"));
        }

	}

}
