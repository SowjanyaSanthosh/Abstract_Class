package javaprograms;

public class Multi_Level_Class extends Multi_Level_abstract2 {
	@Override
	public void m3() {
		System.out.println("m3 is an abstract method and implemented in multi_level_class class");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 is an abstract method and implemented in multi_level_class class");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 is an abstract method and implemented in multi_level_class class");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 is an abstract method and implemented in multi_level_class class");
	}

	public static void main(String[] args) {
		 Multi_Level_Class mlc=new  Multi_Level_Class();
		 mlc.m1();
		 mlc.m2();
		 mlc.m3();
		 mlc.m4();

	}

	

}
