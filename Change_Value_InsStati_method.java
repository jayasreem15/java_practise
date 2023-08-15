package java_project;

public class Change_Value_InsStati_method {
	static int a=10;
	static int change() {
		a=20;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int changable=Change_Value_InsStati_method.change();
		System.out.println(changable);
	}

}
