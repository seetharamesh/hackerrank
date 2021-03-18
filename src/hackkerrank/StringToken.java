package hackkerrank;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "He is a very very good boy, isn't he?";
		
		String[] tokens = str.split("[^a-zA-Z]");
        int numTokens = 0;
       
        for (int i=0; i<tokens.length; ++i) 
            if (tokens[i].length() > 0) 
                numTokens++;
            
        System.out.println(numTokens);
       
        for (int i=0; i<tokens.length;++i)
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
   }
		
		
		
		
		
//		String delimiters = "[ !,?.\\\\_'@]+";
//		String [] values = str.split(delimiters);
//		System.out.println(values.length);
//		for(String value: values) {
//			System.out.println(value);
//		}
//		

		
	}

//}
