package com.idm.main;

import com.idm.factorial.Context;
import com.idm.factorial.FactorialV1;
import com.idm.factorial.FactorialV2;

public class TestMain {

	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		FactorialV1 f1 = new FactorialV1(n);
		System.out.println("Resultat Factorial V1 : " + f1.getRes());
		FactorialV2 f2 = new FactorialV2(n);
		System.out.println("Resultat Factorial V2 : " + f2.getRes());
		Context context;
		context = new Context(new FactorialV1(n));
	    int resultF1 = context.executeFactorial(n);
	    context = new Context(new FactorialV2(n));
	    int resultF2 = context.executeFactorial(n);	 
	    System.out.println("Result F1 : " + resultF1 );
	    System.out.println("Result F2 : " + resultF2 );
	}

}
