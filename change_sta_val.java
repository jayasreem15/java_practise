package java_project;

public class change_sta_val {
	 static int a=10;
	 static int change() {
		 int b=90;
		 return b;
	 }
	public static void main(String[] args) {
        int changeable=change_sta_val.change();
        System.out.println(changeable);
	}

}
