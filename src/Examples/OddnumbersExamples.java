package Examples;

public class OddnumbersExamples {

	public static void main(String[] args) {
		
		int a[]= {4,5,6,7,8,9,5,6,7,8};
		System.out.println("odd numbers");
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				
				System.out.println("even numbers   "+ a[i]);
			}
			
		}

	}	

}
