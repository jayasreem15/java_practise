package java_project;

public class this_spr_staticNot {
	 int a=10;
	 int b=20;
	static int show(a,b) {
		System.out.println(a.this+" "+b.this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_spr_staticNot.show(10,20);
	}
}
