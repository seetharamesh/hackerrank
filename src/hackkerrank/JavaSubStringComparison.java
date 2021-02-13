package hackkerrank;
import java.util.*;

public class JavaSubStringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. storing string to character array
		String str = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl"
				+ "fhsdlhkfsdlfLHDFLSDKFHsdfh"
				+ "sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs"
				+ "dkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		char[] c = new char[str.length()];
		char[] orig = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);
			orig[i] = str.charAt(i);
		}
//		for (char ch : c) { 
//            System.out.println(ch); 
//        } 
//		System.out.println("\n");

		//2. sort the character array[defaults to descending for characters]
		Arrays.sort(c);
		//3. extract the first(highest) and last(lowest) alphabets from sorted array
		char[] temp = c;
		char c1 = temp[0];
		char c2 = temp[temp.length-1];	
		System.out.println("lowest one: " + c1);
		System.out.println("highest one: " + c2);
		System.out.println("***********\n");
		int count = 30;
		String smallest="";
		String largest="";
		for(int j=0;j<orig.length;j++) {
			if(orig[j] == c1) {
				int index = j;
				//System.out.println("\nindex starts at:" + index);
				while(count >=1) {
				//	System.out.print(orig[index]);
					smallest = smallest + orig[index];
					count--;
					index++;
				}
				break;
			}
		}
		
		count = 30;
		System.out.println("****");
		for(int j=0;j<orig.length;j++) {
			if(orig[j] == c2) {
				int index = j;
				System.out.println("\nindex starts at:" + index);
				while(count >=1) {
					//System.out.print(orig[index]);
					largest=largest+orig[index];
					count--;
					index++;
				}
				break;
			}
		}
		System.out.println(smallest + "\n" + largest);
		
//		for (char sortedarr : c) {
//	         System.out.println(sortedarr);
//	      }
//		//converting char array back to string
//		String convertback = String.valueOf(c);
//		System.out.println("Converted back:" + convertback);
//		System.out.println(convertback.substring(0,3));
//		StringBuilder sbr = new StringBuilder();
//		sbr.append(convertback);
//		sbr.reverse();
//		System.out.println(sbr);
//		System.out.println(sbr.substring(0,3));
	}

}
