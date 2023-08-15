package java_project;

public class static_method {
	static int a=10;
	void show() {
		System.out.println("this is an instance");
	}
	static void display() {
		System.out.println("this is an staticmethod:");
		
	}
	public static void main(String[] args) {
		static_method st=new static_method();
		st.show();
		static_method s=null;
		s.display();
		int c=s.a;
		System.out.println(c);	
	}
}
