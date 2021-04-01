package hackkerrank;

public class OuterClassExample {
	static int num = 100;
	
	static class InnerClass{
		private void println() {
			System.out.println("Hello i am innerclass println method");
		}	
		private int getNum() {
			System.out.println("inside innerclass getNum()");
			return num;
		}
	}
	
	void display_inner() {
		InnerClass ic = new InnerClass();
		ic.println();
	}
	void display_num() {
		Object o;
		o = new OuterClassExample. InnerClass();
		System.out.println("inside innerclass display num: " + ((OuterClassExample.InnerClass)o).getNum());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClassExample oc = new OuterClassExample();
		oc.display_inner();
		oc.display_num();
	}

}
