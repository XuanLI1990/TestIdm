package com.idm.factorial;

public class FactorialV1 implements FactorialV3{
	
	private int res = 1;
	
	public FactorialV1(int n){
		res = execute(n);
	}
	
	public int execute(int n){
		int k = 1;
		if(n == 0){
			k= 1;
		}else{
			for(int i=1;i<=n;i++){
				 k = i * k;				
			}
		}
		return k;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}
	
}
