package javaprograms;

public class Hierarchical_Class1 extends Hierarchical_Abstract{

	@Override
	public void m1() {
		System.out.println("m1 is an abstract method and implemented in hierarchical_class1 class");	
		
	}

	@Override
	public void m2() {
		
		System.out.println("m2 is an abstract method and implemented in hierarchical_class1 class");	
		
	}
	public static void main(String [] args)
	{
		 Hierarchical_Class1 hc1=new  Hierarchical_Class1();
		 hc1.m1();
		 hc1.m2();
		 Hierarchical_Class2 hc2=new Hierarchical_Class2();
		 hc2.m1();
		 hc2.m2();
	}

}
class Hierarchical_Class2 extends Hierarchical_Abstract{

	@Override
	public void m1() {
		System.out.println("m1 is an abstract method and implemented in hierarchical_class2 class");	
		
	}

	@Override
	public void m2() {
		
		System.out.println("m2 is an abstract method and implemented in hierarchical_class2 class");	
		
	}
	

}
