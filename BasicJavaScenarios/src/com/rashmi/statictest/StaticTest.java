package com.rashmi.statictest;

class Test {

	int x;
	static int i;
	static {
		System.out.println("Static block called");
		i = 10;
	}

	{
		System.out.println("Initializer Block called");
	}

	static {
		System.out.println("Second static block called");
	}
	/*

	Test() {
		System.out.println("Constructor block called");
	}
	
	Test(int x) {
		System.out.println("Constructor with argument block called");
		this.x = x;
		
	}
	*/
	
	

	static void testmethod() {
		System.out.println("Static method called");
	}
}

public class StaticTest {
	public static void main(String[] args) {

		/**
		 * 1. Observe static blocks being called and then initializer and constructor blocks
		 * For: Test t = new Test();
		 * Output: 
		 * Static block called
		 * Second static block called
		 * Initializer Block called
		 * Constructor block called
		 * 
		 */

		//Test t = new Test();

		/**
		 * 2. Just declaring the object reference does not cause class loading
		 * For: Test test;
		 * No Output;
		 */
		
		//Test test;
		
		/**
		 * 3. Class gets loaded when static variable is accessed, either by doing Class.variable 
		 * or by accessing through object reference(even if it is not initialized
		 * For: 
		 * Test t ; or Test t = null;
		 * System.out.println(t.i);
		 * Output:
		 * Static block called
		 * Second static block called
		 * 10
		 */
		
		  //Test t = null;
		  //System.out.println(t.i); 
		 
		  /**
		   * 4. Test initializer block gets copied to multiple constructors
		   * For:
		   * Test t1 = new Test();
		   * Test t2 = new Test(20);
		   * Output:
		   * Static block called
		   * Second static block called
		   * Initializer Block called
           * Constructor block called
           * Initializer Block called
           * Constructor with argument block called
		   */
		  //Test t1 = new Test();
		  //Test t2 = new Test(20);
		  
		  /**
		   * 5. Initializer blocks gets copied to default
		   * Static block called
		   * Second static block called
		   * Initializer Block called
		   */
		  //Test t1 = new Test();
		
		  
	}

}
