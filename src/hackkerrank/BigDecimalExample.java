package hackkerrank;

import java.math.BigDecimal;
import java.util.*;

class BigDecimalExample{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();        
        }
      	sc.close();

        //Write your code here
      	for(int j = 0 ; j < n ; j++) {
      		int index = j;
      		BigDecimal bd1 = new BigDecimal(s[j]);
      		for(int k = j+1; k < n; k++) {
      	 
      	 BigDecimal bd2 = new BigDecimal(s[k]);
      	 int res = bd2.compareTo(bd1);//compareTo return 1 if first value(bd2) is greater than bd1, 0 if both are equal, -1 if second value is greater
      	 if(res == 1) {
      		 bd1 = bd2;
      		 index = k; 
      	 }
      	}
      		String temp=s[j];
            s[j]=s[index];
            s[index]=temp;
      	}
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}