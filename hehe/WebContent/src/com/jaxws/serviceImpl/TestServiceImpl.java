package com.jaxws.serviceImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jaxws.dao.TestDao;
import com.jaxws.service.TestService;
@WebService(endpointInterface="com.jaxws.service.TestServiceImpl",
serviceName="testService",
targetNamespace="http://sevice.jaxws.com")

public class TestServiceImpl implements TestService{

	@Override
	@WebMethod(operationName="getService")
	public void getService(String xml) {
		System.out.println(xml+"-----------------------------------serviceImpl");
		TestDao testDao = new TestDao();
		testDao.test(xml);
		
	}

}
