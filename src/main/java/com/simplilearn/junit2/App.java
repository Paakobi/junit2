package com.simplilearn.junit2;

import com.simplilearn.junit2.model.PromoCodes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "JUnit5" );
       PromoCodes pRef = new PromoCodes();
       System.out.println( " JUMBO DISCOUNT double is:" + pRef.getDiscount("JUMBO")     );
       System.out.println(" AMOUT DISOCOUTN is:" + pRef.getDiscountOnAmount("TRYNEW", 1000));
       System.out.println(" AMT_Dicount_w_Taxes_SUNDAY :" +pRef.getDiscountOnAmountWithTaxes("SUNDAY", 1000));
       
    }
}
