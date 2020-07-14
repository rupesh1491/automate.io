package com.qa.Tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.Restclient;
import com.qa.util.TestUtil;

import org.apache.http.client.methods.CloseableHttpResponse;

public class GetAPITest extends TestBase {

	
	
	public GetAPITest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	TestBase testbase;
	String serviceURL;
	String apiURl;
	String URL;
	Restclient restClient;
	CloseableHttpResponse closeableHttpResponse;
	
	@BeforeMethod
	
	public void setUp() throws IOException{
		 testbase=new TestBase();
		 serviceURL=prop.getProperty("URL");
		 apiURl=prop.getProperty("serviceURL");
		 
		 URL=serviceURL+apiURl;
	}
	 @Test(priority=1)
	public void getAPITestWithoutHeader() throws ClientProtocolException, IOException{
		restClient=new Restclient();
		closeableHttpResponse=	restClient.get(URL);
	
	
	

	//status code
	int statucCode =closeableHttpResponse.getStatusLine().getStatusCode();
	System.out.println("status code"+ statucCode);
	
	Assert.assertEquals(statucCode, RESPONCE_STATUS_CODE_200,"Status code is not 200");
	
	// Json String:
	String responseString=EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
	JSONObject responseJson=new JSONObject(responseString);
	System.out.println("Response JSON from API-->"+responseJson);
	
	//Single Value Assertion per page:	
	String perPageValue=TestUtil.getValueByJPath(responseJson, "/per_page");
	System.out.println("value of page is--->"+perPageValue);
	Assert.assertEquals(Integer.parseInt(perPageValue), 6);
	
	String totalValue=TestUtil.getValueByJPath(responseJson, "/total");
	System.out.println("value of total is--->"+totalValue);
	Assert.assertEquals(Integer.parseInt(totalValue), 12);
	
	//Get the value From JSON array
	String lastName=TestUtil.getValueByJPath(responseJson, "/data[0]/last_name");
	String id=TestUtil.getValueByJPath(responseJson, "/data[0]/id");
	String avatar=TestUtil.getValueByJPath(responseJson, "/data[0]/avatar");
	String firstName=TestUtil.getValueByJPath(responseJson, "/data[0]/first_name");
	
	System.out.println("lastname = "+lastName);
	System.out.println("id = "+id);
	System.out.println("avatar = "+avatar);
	System.out.println("firstName = "+firstName);
	
	//All headers
	Header[] arrayheader=closeableHttpResponse.getAllHeaders();
	
	HashMap<String,String> allheaders=new HashMap<String,String>();
	
	for(Header header:arrayheader){
		allheaders.put(header.getName(), header.getValue());
	}
	System.out.println("Header Arrays....>"+arrayheader);
}

	
	@Test(priority=2)
	public void getAPITestWithHeaders() throws ClientProtocolException, IOException{
		restClient=new Restclient();
		
	
		HashMap<String,String> headermap=new HashMap<String,String>();
	    
		headermap.put("Content-Type", "application/Json");
		//headermap.put("username", "test@amzon.com");
		//headermap.put("password", "test123");
		closeableHttpResponse=	restClient.get(URL,headermap);
	//status code
	int statucCode =closeableHttpResponse.getStatusLine().getStatusCode();
	System.out.println("status code"+ statucCode);
	
	Assert.assertEquals(statucCode, RESPONCE_STATUS_CODE_200,"Status code is not 200");
	
	// Json String:
	String responseString=EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
	JSONObject responseJson=new JSONObject(responseString);
	System.out.println("Response JSON from API-->"+responseJson);
	
	//Single Value Assertion per page:	
	String perPageValue=TestUtil.getValueByJPath(responseJson, "/per_page");
	System.out.println("value of page is--->"+perPageValue);
	Assert.assertEquals(Integer.parseInt(perPageValue), 6);
	
	String totalValue=TestUtil.getValueByJPath(responseJson, "/total");
	System.out.println("value of total is--->"+totalValue);
	Assert.assertEquals(Integer.parseInt(totalValue), 12);
	
	//Get the value From JSON array
	String lastName=TestUtil.getValueByJPath(responseJson, "/data[0]/last_name");
	String id=TestUtil.getValueByJPath(responseJson, "/data[0]/id");
	String avatar=TestUtil.getValueByJPath(responseJson, "/data[0]/avatar");
	String firstName=TestUtil.getValueByJPath(responseJson, "/data[0]/first_name");
	
	System.out.println("lastname = "+lastName);
	System.out.println("id = "+id);
	System.out.println("avatar = "+avatar);
	System.out.println("firstName = "+firstName);
	
	//All headers
	Header[] arrayheader=closeableHttpResponse.getAllHeaders();
	
	HashMap<String,String> allheaders=new HashMap<String,String>();
	
	for(Header header:arrayheader){
		allheaders.put(header.getName(), header.getValue());
	}
	System.out.println("Header Arrays....>"+arrayheader);
}

	
}

