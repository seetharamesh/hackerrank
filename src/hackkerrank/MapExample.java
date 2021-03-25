package hackkerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first get number of entries in phonebook
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();//get number of entries in phonebook
		in.nextLine(); //this is for enter key stroke
		
		//create hashmap to store users name and phone number
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine(); //accept name
			int phone=in.nextInt(); //accept phone number
			hm.put(name, phone);
			in.nextLine();//accept enter key stroke
		}
		while(in.hasNext())
		{
			String s=in.nextLine();//to accept queries
			if(hm.containsKey(s)) {
				System.out.println(s + "=" + hm.get(s));
			}
			else System.out.println("Not found");
		}
		in.close();
		
	}

}
