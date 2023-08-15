package java_project;

public class subarrat_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int a[]= {1,2,3,7,5};
		int s = 12,sum=0,max=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				sum=a[i]+a[j];
			    if(sum==s) {
				continue;
			}
				System.out.println(i+" "+j);
		    }
		}
	}
}
