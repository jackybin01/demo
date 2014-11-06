package com.example.lv_demo;

public class Model {
	private String ProfilePic;
	private String Title;
	private String Time;
	private String Description;
	

	public Model(String Title, String Time, String Description) {
		this.Title = Title;
		this.Time = Time;
		this.Description = Description;
	}


//	public String getProfilePic() {
//		return ProfilePic;
//	}
//
//
//	public void setProfilePic(String profilePic) {
//		ProfilePic = profilePic;
//	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getTime() {
		return Time;
	}


	public void setTime(String time) {
		Time = time;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}
	
	
}
