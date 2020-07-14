package com.qa.Tests;



import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.impl.client.CloseableHttpClient;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.Restclient;
import com.qa.data.Users;

public class PostAPITest extends TestBase{
	
	public PostAPITest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	TestBase testbase;
	String serviceUrl;
	String apiUrl;
	String url;
	Restclient restClient;
	CloseableHttpClient closeableHttpResponce;
	
	@BeforeMethod
	public void setUp() throws IOException{
		testbase= new TestBase();
		serviceUrl=prop.getProperty("URL");
		apiUrl=prop.getProperty("serviceUrl");
		url=serviceUrl+apiUrl;
	}
	@Test
	public void postAPITest() throws JsonGenerationException, JsonMappingException, IOException{
		restClient=new Restclient();
		HashMap<String,String> headermap=new HashMap<String, String>();
		
		
		//Jackson ApI
		ObjectMapper mapper=new ObjectMapper();
		Users users=new Users("morpheus","leader");
		
		//object to jon file
		mapper.writeValue(new File("C:/Users/dell/workspace/Interview/src/main/java/com/qa/data/users.json"), users );
		
	}

	
	
	
	

	
	

}
