package com.simplilearn.junit2.model;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class PromoCodes {

	// Private fields or properties
	private List<String> promoCodes;

	TreeMap<String, Double> promoCodesWithDiscounts;

	// Constructor
	public PromoCodes() {
		promoCodes = Arrays.asList("JUMBO", "BINGO", "HAPPY50", "TRYNEW90", "SUNDAY");
		promoCodesWithDiscounts = new TreeMap<String, Double>();
		promoCodesWithDiscounts.put(promoCodes.get(0), 0.40);
		promoCodesWithDiscounts.put(promoCodes.get(1), 0.20);
		promoCodesWithDiscounts.put(promoCodes.get(2), 0.50);
		promoCodesWithDiscounts.put(promoCodes.get(3), 0.90);
		promoCodesWithDiscounts.put(promoCodes.get(4), 0.25);
	}

	
	//public methods
	// accessModifier	//Return Type				//nameOfMethod			//parameter
	//public methods
		//accessModifer		//ReturnType		//nameOfMethod			//parameter
		public				Double				getDiscount				(String promoCode      ) {			
					//ternary_operator_testing_condition "?"		 //promoCode_DOUBLE_value_if_it_does_exist          //defaultValueIfPromoCodeDoesNotExist
			return promoCodesWithDiscounts.containsKey(promoCode) ?   promoCodesWithDiscounts.get(promoCode)             : 0.05   ;
			
			
		}
		
		public Double getDiscountOnAmount (String promoCode, double amount) {
			
			return promoCodesWithDiscounts.containsKey(promoCode) ? (amount - amount*promoCodesWithDiscounts.get(promoCode)): (amount - amount *0.05) ;
			
		}
		
		
		public Double getDiscountOnAmountWithTaxes(String promoCode, double amount) {
			double amountAfterDiscount = getDiscountOnAmount(promoCode, amount);
			return (amountAfterDiscount + (0.18 * amountAfterDiscount));
			
								
		}
		
		public boolean checkPromoCode (String promoCode) {
			return promoCodes.contains(promoCode);
		}
	
}
