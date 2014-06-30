package com.idm.factorial;

public class FactorialV2 implements FactorialV3{
	
	private int res = 1;
	
	public FactorialV2(int n){
		res = execute(n);
	}
	
	public int execute(int n){
		if(n == 0){
			return 1;
		}else{			
			return n * execute(n-1);
		}
	}	
	
	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}
}
