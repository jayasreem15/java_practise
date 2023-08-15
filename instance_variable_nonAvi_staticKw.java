package java_project;

public class instance_variable_nonAvi_staticKw {
	static int x=10;
	int y=20;
	void display() {
		System.out.println(y);
		System.out.println(x);
	}
 static void show() {
//	 System.out.println(y);//instance variable
		System.out.println(x);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instance_variable_nonAvi_staticKw st=new instance_variable_nonAvi_staticKw();
		st.display();
		show();
	}

}
