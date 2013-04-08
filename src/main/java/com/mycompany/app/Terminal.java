package com.mycompany.app;

import java.util.HashMap;
import java.util.HashSet;


public class Terminal {
	public double total;
	private HashMap<String, Integer> scannedUnits;
	private HashMap<String, PriceUnit> productPricing;


	public Terminal() {
		scannedUnits = new HashMap<String, Integer>();
		productPricing = new HashMap<String, PriceUnit>();
	}

	public void setPricing(String productCode, PriceUnit pu ) {
		productPricing.put(productCode, pu);
	}

	public void scan(String productCode) {
		if(scannedUnits.get(productCode) != null) {
			scannedUnits.put(productCode, new Integer(scannedUnits.get(productCode).intValue() + 1));
		} else {
			scannedUnits.put(productCode, new Integer(1));
		}

		calculateResult();
	}

	public void calculateResult() {
		this.total= 0;

		for (String productCode : new HashSet<String>(scannedUnits.keySet())) {
			PriceUnit pu = this.productPricing.get(productCode);
			int totalProducts = scannedUnits.get(productCode).intValue();

			if(pu.volumeUnitSize > 0) {
				int div = totalProducts / pu.volumeUnitSize;
				int mod = totalProducts % pu.volumeUnitSize;
				this.total  += (div * pu.volumeUnitPrice) + (mod * pu.singleUnitPrice);
			} else {
				this.total  +=  totalProducts * pu.singleUnitPrice;
			}
		}
	}
}
