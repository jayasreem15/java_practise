package java_project;

public class fact_static {
	static int f1=1;
	static void fact(int a) {
		for(int i=1;i<=a;i++) {
			f1=f1*i;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact_static.fact(5);
		System.out.println(fact_static.f1);

	}

}
