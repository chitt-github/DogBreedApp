package com.adp.dogbreed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.adp.dogbreed.data.model.DogBreed;

public class DogBreedDao {
	
	public ArrayList<DogBreed> getAllDogs(Connection connection) throws Exception {
		ArrayList<DogBreed> dogBreedList = new ArrayList<DogBreed>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT image_id,image_name,breedType,favoriteCount,otherInfo,url FROM dog_details ORDER BY image_id DESC");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				DogBreed dogBreed = new DogBreed();
				dogBreed.setImageId(rs.getInt("image_id"));
				dogBreed.setImageName(rs.getString("image_name"));
				dogBreed.setBreedType(rs.getString("breedType"));
				dogBreed.setFavoriteCount(rs.getLong("favoriteCount"));
				dogBreed.setOtherInfo(rs.getString("otherInfo"));
				dogBreed.setUrl(rs.getString("url"));
				dogBreedList.add(dogBreed);
			}
			return dogBreedList;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public ArrayList<DogBreed> getAllDogsByBreedType(Connection connection, String breedType) throws Exception {
		ArrayList<DogBreed> dogBreedList = new ArrayList<DogBreed>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT image_id,image_name,breedType,favoriteCount,otherInfo,url FROM dog_details where breedType = ?");
			ps.setString(1, breedType);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				DogBreed dogBreed = new DogBreed();
				dogBreed.setImageId(rs.getInt("image_id"));
				dogBreed.setImageName(rs.getString("image_name"));
				dogBreed.setBreedType(rs.getString("breedType"));
				dogBreed.setFavoriteCount(rs.getLong("favoriteCount"));
				dogBreed.setOtherInfo(rs.getString("otherInfo"));
				dogBreed.setUrl(rs.getString("url"));
				dogBreedList.add(dogBreed);
			}
			return dogBreedList;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public int updateFavoriteCount(Connection connection, Integer imageId, Integer favoriteCount) throws Exception {
		int count = 0;
		try {
			PreparedStatement ps = connection
					.prepareStatement("update dog_details set favoriteCount = favoriteCount + ? where image_id = ?");
			ps.setInt(1, favoriteCount);
			ps.setInt(2, imageId);			
			count =  ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
		return count;
	}

}
