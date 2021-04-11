package hackkerrank;

 class Test2{
	 static int add(int a, int b) {
		return (a+b);
	}
}
//testing
public class TestExample extends Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s = 9;
		System.out.println(add(s,10));
		System.out.println("**********");
		Float f1 = new Float("3.0");
		int x = f1.intValue();
		byte y = f1.byteValue();
		double z = f1.doubleValue();
		System.out.println(x+y+z);
		int i = 010;
		System.out.println(i);
	}

}