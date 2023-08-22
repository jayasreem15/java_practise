package java_project;
class electronic_devices{
	public String brand;
	public String diff_work;
	
	public void turnon() {
		System.out.println("turn -On");
	}
	public void turnoff() {
		System.out.println("turn-off");
	}
}
class Mobile extends electronic_devices{
	public String name="Mobile";
	public int cost=20000;
//	public void name() {
//		// TODO Auto-generated method stub
//		
//	}
}
public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubmo
		Mobile mymobile=new Mobile();
System.out.println(mymobile.name);
		mymobile.turnon();
		System.out.println(mymobile.brand);
		mymobile.turnoff();
		System.out.println(mymobile.cost);
	}

}
