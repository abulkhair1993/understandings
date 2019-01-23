package com.interface1.problem;

public class Test {

	public static void main(String[] args) {
		ThreadInDetail threadInDetail = new ThreadInDetail();
		//threadInDetail.run();
		Thread t =new Thread(()->System.out.println("Features"));
		t.start();

	}

}
