package com.adp.dogbreed.data.model;

public class DogBreed {

	private Integer imageId;
	private String imageName;
	private String url;
	private Long favoriteCount;
	private String breedType;
	private String otherInfo;
	
	public DogBreed(){
		super();
	}
	public DogBreed(String url, Long favoriteCount, String breedType, String otherInfo) {
		super();
		this.url = url;
		this.favoriteCount = favoriteCount;
		this.breedType = breedType;
		this.otherInfo = otherInfo;
	}
	
	public Integer getImageId() {
		return imageId;
	}
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getFavoriteCount() {
		return favoriteCount;
	}
	public void setFavoriteCount(Long favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	public String getBreedType() {
		return breedType;
	}
	public void setBreedType(String breedType) {
		this.breedType = breedType;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public String toString() {
		return "Dog [url=" + url + ", favoriteCount=" + favoriteCount + ", breedType=" + breedType + ", otherInfo="
				+ otherInfo + "]";
	}
	
	
	
}
