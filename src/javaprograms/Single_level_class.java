package javaprograms;


public class Single_level_class extends Single_Level1_abstract{
	@Override
	public void m1() {
		System.out.println("m1 is an abstract method and implemented in Single_level_class class");
		
	}

	@Override
	public void m2() {
		System.out.println("m is an abstract method and implemented in Single_level_class class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_level_class slc=new Single_level_class();
		slc.m1();
		slc.m2();
	}

	

}
