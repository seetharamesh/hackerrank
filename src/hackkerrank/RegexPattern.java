package hackkerrank;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPattern {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		try {
		Pattern p = Pattern.compile("[AZ[a-z](a-z)");
		System.out.println("Valid");
		}
		catch(PatternSyntaxException e) {
			System.out.println("Invalid");
		}
		// Matcher m = p.matcher("aaaaab");
		// boolean b = p.matches(p, null);

	}

}
