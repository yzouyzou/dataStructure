package src.com.jaxws.serviceImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import src.com.jaxws.dao.TestDao;
import src.com.jaxws.service.TestService;
@WebService(endpointInterface="com.jaxws.service.TestServiceImpl",
serviceName="testService",
targetNamespace="http://sevice.jaxws.com")

public class TestServiceImpl implements TestService{

	@Override
	@WebMethod(operationName="getService")
	public String getService(String xml) {
		System.out.println(xml+"-----------------------------------serviceImpl");
		TestDao testDao = new TestDao();
		return testDao.test(xml);
		
	}

}
