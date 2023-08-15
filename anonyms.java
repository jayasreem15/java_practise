package java_project;

public class anonyms {
	int a;
	int b;
	int c;
	int d;
	
	anonyms(int p,int q){
		a=p;
		b=q;
		int  ab=a+b;
		System.out.println("adition value:"+ab);
	}
 void addition(int x,int y) {
	 c=x;
	 d=y;
	 int cd=c+d;
	 System.out.println("addiion1 value"+cd);
 }
 void subraction(int e,int h) {
	 c=e;
	 d=h;
	 int cd=c-d;
	 System.out.println("cd vallus"+cd);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new anonyms(1,4).addition(3, 5);
			new anonyms(9,0).addition(5, 9);
			new anonyms(89,7).subraction(5, 3);
	}

}
