package com.bank;

import java.util.Comparator;

public class SortByAmount implements Comparator<BankTransactions>{
    public int compare(BankTransactions o1, BankTransactions o2) {
		if(o1.getAmount().compareTo(o2.getAmount())<0){
			return -1;
		}
		else if(o1.getAmount().compareTo(o2.getAmount())>0){
			return 1;
		}
		else {
			return 0;
		}
	}

	
	
}
