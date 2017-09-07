package com.adp.dogbreed.data.model;

import java.sql.Connection;
import java.util.ArrayList;

import com.adp.dogbreed.dao.Database;
import com.adp.dogbreed.dao.DogBreedDao;

public class ProjectManager {

	public ArrayList<DogBreed> getAllDogs() throws Exception {
		ArrayList<DogBreed> feedsList = null;
		try {
			Database database = new Database();
			Connection connection = database.Get_Connection();
			DogBreedDao dogBreedDao = new DogBreedDao();
			feedsList = dogBreedDao.getAllDogs(connection);
		} catch (Exception e) {
			//throw e;
			e.printStackTrace();
		}
		return feedsList;
	}
	
	public ArrayList<DogBreed> getAllDogsByBreedType(String breedType) throws Exception {
		ArrayList<DogBreed> feedsList = null;
		try {
			Database database = new Database();
			Connection connection = database.Get_Connection();
			DogBreedDao dogBreedDao = new DogBreedDao();
			feedsList = dogBreedDao.getAllDogsByBreedType(connection,breedType);
		} catch (Exception e) {
			//throw e;
			e.printStackTrace();
		}
		return feedsList;
	}
	
	public int updateFavoriteCount(Integer imageId, Integer favoriteCount) throws Exception {
		int count = 0;
		try {
			Database database = new Database();
			Connection connection = database.Get_Connection();
			DogBreedDao dogBreedDao = new DogBreedDao();
			count = dogBreedDao.updateFavoriteCount(connection,imageId,favoriteCount);
		} catch (Exception e) {
			//throw e;
			e.printStackTrace();
		}
		return count;
	}
	

}
