package com.idm.factorial;

public class Context {
	private FactorialV3 f3;
	 
    public Context(FactorialV3 strategy) {
        this.f3 = strategy;
    }
    public int executeFactorial(int n) {
        return this.f3.execute(n);
    }
}
