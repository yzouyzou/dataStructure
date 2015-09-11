package com.jaxws.sevice;

public class TestWS {
	public static void main(String args[]){
		System.out.println("test dkfjdkfj");
		TestService ts = new TestService();
		TestServicePortType tst = ts.getTestServiceHttpSoap11Endpoint();
		String strs = tst.getService("ws Test");
		System.out.println("test ws ......."+strs);
	}
}
