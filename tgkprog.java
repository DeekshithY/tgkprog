package com.demo;


//package optional, is fine or any test/academic one

//no imports just java.lang used
/**
*
* Make a class with a main method, the target method , test helper and test cases function
* Read all instructions. Twice (comments in this calss).
*
* Your question will be different than Icy Hot, with different parameters and requirement.
* IcyHot is a sample.
*
* You can copy the structure of IcyHot
* I will judge on test cases (different test data, testing edge cases, to properly test the requirements)
*
* Its not J Unit style, but is single class with solution and unit test cases with main method.
*
* Main method calls Test cases function
*
* Test cases function calls test helper function repeatedly with different test data and expected value
*
* test helper calls target function and compares actual return with expected
*
* Target function and, unit test cases and test helper
* Change the file encoding in your IDE/ text editor to UTF-8 (as some characters are outside of ASCII).
*
* If have IDE, ignore this : Run in command prompt (not required if doing in IDE):
* cd c:\j
* c:
* javac c:\j\IcyHot.java
* java IcyHot
*
*/
public class IcyHot {

	public static void main(String[] args) {
		IcyHot app = new IcyHot();
		app.icyHotTestCases();
	}

	private int count;
	private int errs;

	/**
	 * Test helper. This function calls target and checks response - if matches expected.
	 *
	 * Same parameters as target function. Plus the last parameter is the return type of the target function (expected valueo of that test case).
	 * So if target function has 2 input parameters this function willhave 3. And if target has 3 input params this one will have 4.
	 * Type and number of parameters can change depending on your question.
	 * Expected value has to be accurately calculated by you. Your helper function parameters and this example's might not match. The concept should match. 
	 *
	 * This works for this target. But for you is a sample. The actual number of parameters and parameter types,
	 * for your test helper, will depend on the parameters of your target function, their type and return type.
	 */
	void testIcyHot(int temp1, int temp2, boolean expectedReturn) {
		boolean actualReturn = false;
		count++;
		try {
			actualReturn = icyHot(temp1, temp2);
		} catch (Throwable e) {
			e.printStackTrace();// log it
			System.err.println("Error " + e);
		}

		if (actualReturn != expectedReturn) {
			System.out.println("Actual :" + actualReturn + ", expected :" + expectedReturn + ", for temp1 :" + temp1 + ", temp2 :" + temp2
					+ ", count :" + count + ".");
			errs++;
		}
	}

	/**
	 * Different test cases - more the better. To adequately test the target function for all
	 * requirements per the question.
	 * Number of test cases depends on question and number & type of parameters in target.
	 * You need to think of the values. Think of edge cases and make sure question scenarios and other scenarios are covrered.
	 * Suggest implement your test helper and test cases functions first and then the target function implemrntation.
	 */
	private void icyHotTestCases() {
		/*
		 * besides date here,
		 * only use Java map if told too, most problems only Java lang package classes
		 */
		System.out.println("IcyHot Test cases, run at " + new java.util.Date());// copy to your test cases and change text IcyHot ...

		testIcyHot(0, 0, false);
		testIcyHot(0, 101, false);
		testIcyHot(-1, 101, true);
		testIcyHot(500, -101,true);
		testIcyHot(0, 100, false);
		testIcyHot(100, 10, false);
		testIcyHot(20, -20, false);
		testIcyHot(-20, 200, true);
		testIcyHot(500, 111, false);
		testIcyHot(120, -1, true);
		testIcyHot(-1, 120, true);
		testIcyHot(0, 101, false);
		testIcyHot(2, 120, false);
		testIcyHot(-100, 1999, true);
		System.out.println("IcyHot test cases count " + count
				+ ", Errors (test case expected value wrong or implmentaion wrong or problem understanding wrong):" + errs + ".");
	}

	/**
	 * Target function, this function is the problem function to implement. The signature should be same as
	 * in your question.
	 *
	 *
	 * Sample Question:
	 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
	 *
	 * icyHot(120, -1) : true
	 * icyHot(-1, 120) : true
	 * icyHot(2, 120) : false
	 *
	 * For debug can have system out println here but in reference website need to comment out.
	 *
	 */
	public boolean icyHot(int temp1, int temp2) {
		if (temp1 < 0 && temp2 > 100|| temp1 > 100 && temp2 < 0) {
			return true;// sample answer, incomplete, your problem will be different and you should implement compleltely
			// ...here not dont complete so can see sample error message when you run this
		}
		
		return false;
	}

}
