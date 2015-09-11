package com.hehe.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Jaxws {
	@WebMethod
	public String hehe(String xml){
		System.out.println("hello"+xml);
		return xml;
	}
	
	public static void main(String args[]){
		Endpoint.publish("http://localhost:8080/hehe", new Jaxws() );
	}
	

}
