package java_project;

public class static_nullable_refer {
	static int a=10;
public	void display() {
		System.out.println("this is an static variable");
	}
static void show() {
	System.out.println("static variable");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_nullable_refer st=new static_nullable_refer();
		st.display();
		static_nullable_refer sm=null;
		sm.show();
		int c=sm.a;
		System.out.println(c);

	}

}
