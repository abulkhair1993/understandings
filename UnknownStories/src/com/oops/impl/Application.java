package com.oops.impl;

public class Application {

	public static void main(String[] args) {
		//Airtel ron = new Airtel("ron");
		Mobile ron = new Mobile();
		ron.airtelActions(new Airtel("Ron"));
		ron.ideaActions(new Idea("Mark"));

	}

}
