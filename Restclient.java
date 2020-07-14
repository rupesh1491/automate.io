package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;



public class Restclient {
	
	//Get Method without Header
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url);
		CloseableHttpResponse closeableHttpResponse=httpclient.execute(httpget);
		
		return closeableHttpResponse;
}
	//HashMap<String,String> headermap=new HashMap<String,String>();
	

	//Get Method with Header
	public CloseableHttpResponse get(String url,HashMap<String,String> headermap) throws ClientProtocolException, IOException{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url);
		
		for(Map.Entry<String,String> entry:headermap.entrySet()){
			httpget.addHeader(entry.getKey(), entry.getValue());
		}
		CloseableHttpResponse closeableHttpResponse=httpclient.execute(httpget);
		
		return closeableHttpResponse;
}
	//POST MEthod
	public CloseableHttpResponse post(String url,String entityString,HashMap<String,String>headermap) throws ClientProtocolException, IOException{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpPost httpost=new HttpPost(url);
		httpost.setEntity(new StringEntity(entityString));
		
		//For Header
		for(Map.Entry<String,String> map:headermap.entrySet()){
			httpost.addHeader(map.getKey(),map.getValue());
		}
      CloseableHttpResponse closeableHttpResponse=httpclient.execute(httpost);	
		return closeableHttpResponse;
		
	}
}
