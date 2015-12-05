package com.j2.state.videoplayer;

public class Sleep implements State{
	VideoPlayer videoPlayer;
	 
    public Sleep(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
 
   
 public void videoPlay() {
  System.out.println("You can't play a video, it is on sleep mode");
 
 }
 
 public void videoStop() {
	 System.out.println("You already stopped playing a video, it is on sleep mode");
	 
	}
 
 public void wake() {
  System.out.println("You turned on your video player");
  videoPlayer.setState(videoPlayer.getOnState());
 }
 
 public void sleepOn() {
  System.out.println("Your video player is already sleeping!");
  }
 
 public void running(){
		System.out.println("Your video player is not playing");
		 
	 }

 
 public String toString() {
  return "on sleep mode";
 }
}