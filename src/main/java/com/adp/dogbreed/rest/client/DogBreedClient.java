package com.adp.dogbreed.rest.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class DogBreedClient {

	Client client = Client.create();
	String getUrl = "http://localhost:8081/DogBreedApp/api/getAllDogs";
	
	public void getRequest(){
		WebResource webResource = client.resource(getUrl);
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
		if(response.getStatus()!=200){
			throw new RuntimeException("HTTP Error: "+ response.getStatus());
		}
		
		String result = response.getEntity(String.class);
		System.out.println("Response from the Server: ");
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		DogBreedClient restClient = new DogBreedClient();
		//fire the get request
		restClient.getRequest();
	}
}
