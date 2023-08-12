package com.wipro.org.videoEntry;

public class Video {
    public Video(String name) {
	  this.setVideoName(name);
    }
	public Video() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
		System.out.println("Video "+"\"videoName"+" added successfully.");
	}
	public boolean isCheckOut() {
		return checkOut;
	}
	public void doCheckOut() {
	        checkOut = true;
		System.out.println("Video checked "+"\"name"+" out successfully");
	}
	public void receiveRating(String name,int rating, Video[] arr) {
		this.rating = rating;
	}
	public int getRating() {
		return rating;
	}
	public void setVideoID(int id) {
		this.videoID = id;
	}
	public int getVideoID() {
		return videoID;
	}
    private String videoName;
    private boolean checkOut;
    private int rating,videoID;
	public void returnVideo(String name, Video[] arr) {
      for (Video video : arr) {
		 if(name.equalsIgnoreCase(video.getName())) {
			 System.out.println("Video Returned");
			 return;
		 }
	  }		
	}
}
