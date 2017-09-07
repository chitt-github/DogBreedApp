package com.adp.dogbreed.rest.controller;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.adp.dogbreed.data.model.DogBreed;
import com.adp.dogbreed.data.model.ProjectManager;
import com.google.gson.Gson;

@Path("/")
public class DogBreedController {

	
	//List all of the available dog pictures grouped by breed
	//List all of the available dog pictures of a particular breed
	//Vote up and down a dog picture
	
	@GET
	@Path("/getAllDogs")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllDogs() {
		String dogList = null;
		try {
			ArrayList<DogBreed> dogBreedList = null;
			ProjectManager projectManager = new ProjectManager();
			dogBreedList = projectManager.getAllDogs();
			Gson gson = new Gson();
			dogList = gson.toJson(dogBreedList);
		}
		catch (Exception e) {
			System.out.println("Exception Error"); 
		}
		return dogList;
	}
	
	@GET
	@Path("/breedType/{breedType}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllDogsByBreedType(@PathParam("breedType") String breedType) {
		String dogList = null;
		try {
			ArrayList<DogBreed> dogBreedList = null;
			ProjectManager projectManager = new ProjectManager();
			dogBreedList = projectManager.getAllDogsByBreedType(breedType);
			Gson gson = new Gson();
			dogList = gson.toJson(dogBreedList);
		}
		catch (Exception e) {
			System.out.println("Exception Error"); 
		}
		return dogList;
	}
	
	@PUT
	@Path("/favoriteCount/{imageId}/{favoriteCount}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateFavoriteCount(@PathParam("imageId") Integer imageId, @PathParam("favoriteCount") Integer favoriteCount) {
		try {
			ProjectManager projectManager = new ProjectManager();
			int count = projectManager.updateFavoriteCount(imageId, favoriteCount);
			if(count==0){
	            return Response.status(Response.Status.BAD_REQUEST).build();
	        }
		}
		catch (Exception e) {
			System.out.println("Exception Error"); 
		}
		return Response.ok().build();
	}
	
	
}
