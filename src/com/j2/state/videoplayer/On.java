package com.j2.state.videoplayer;



public class On implements State{
	VideoPlayer videoPlayer;
	 
    public On(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
 
   
 public void videoPlay() {
	 System.out.println("You played a video");
  videoPlayer.setState(videoPlayer.getPlayState());
  
 }
 
 public void videoStop() {
	 System.out.println("You haven't played a video");
		
	}
 
 public void wake() {
  System.out.println("Your screen is alreday on");
 }
 
 public void sleepOn() {
  System.out.println("You turned off your screen");
  videoPlayer.setState(videoPlayer.getSleepState());
  }
 
 public void running(){
		System.out.println("Your video player is not playing");
		 
	 }

 
 public String toString() {
  return "waiting for playing video";
 }
}

