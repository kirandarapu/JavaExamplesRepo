package Examples;

interface  A{//1parent
	
	int a=10;
	int b=11;
	public void sum();
 
	
}
interface B{//2nd parent class
	int x=15;
	public void sub();
} 
class C implements A,B{

	@Override
	public void sub() {
		System.out.println(a-b);
		
	}

	@Override
	public void sum() {
		System.out.println(x-a);
		
	} //child class
	
}




public class MultipleInheritanceExample {

	public static void main(String[] args) {
		
		C c=new C();
		c.sum();
		c.sub();

	}

}
