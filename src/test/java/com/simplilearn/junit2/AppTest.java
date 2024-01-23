package com.simplilearn.junit2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.simplilearn.junit2.model.PromoCodes;

/**
 * Unit test for simple App.
 */
//public class AppTest 
//    extends TestCase
//{
//	
//	private PromoCodes promoCodes;
//	
//	
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//        promoCodes = new PromoCodes();
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//    
//   public void testPromoCode() {
//	   assertEquals(true,promoCodes.checkPromoCode("BINGO"));
//	   
//   }
//}

public class AppTest{
	
	
	
	//field 
	private PromoCodes promoCodes = new PromoCodes();
	
	//test Method
	@Test
	public void testPromoCode() {
	assertEquals(true,promoCodes.checkPromoCode("BINGO"));
	
	}
	
	@Test
	public void testDiscount(){
		String pCode = "JUMBO";
		double expectedDiscount = 0.4;
		
		assertEquals(expectedDiscount, promoCodes.getDiscount(pCode));
	}
	
	@Test
	public void testAmountDiscoutn() {
		String pCode = "TRYNEW";
		double amount = 1000;
		double expectedAmount = 950;
		
		assertEquals(expectedAmount, promoCodes.getDiscountOnAmount(pCode, 1000));
		
	}
	
	
}