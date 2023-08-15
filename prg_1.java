package java_project;
import java.util.Scanner;
public class prg_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub\
		System.out.print("string");
		String str=sc.nextLine();
		System.out.println("strings:");
		String st[]=sc.nextLine().toUpperCase().split(":");
		int n=str.indexOf("_");
		String a=str.substring(0,n),b=str.substring(n+1);
		StringBuffer sb=new StringBuffer();
		for(String i:st) {
			String l=i.substring(0,n),m=i.substring(n+1);
			if(l.equals(a)&&m.equals(b)){
				sb.append(i+":");
			}
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
	}

}
