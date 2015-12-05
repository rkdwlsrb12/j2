package com.j2.state.videoplayer;

public class Stop implements State{
	VideoPlayer videoPlayer;
	 
    public Stop(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
 
   
 public void videoPlay() {
  System.out.println("You replayed a video");
  videoPlayer.setState(videoPlayer.getPlayState());
 }
 
 public void videoStop() {
	 System.out.println("You already stopped playing a video");
	}
 
 public void wake() {
  System.out.println("Your screen is already on");
 }
 
 public void sleepOn() {
  System.out.println("Your video player is now on sleep mode");
  videoPlayer.setState(videoPlayer.getSleepState());
  }
 
public void running(){
	System.out.println("Your video player is not playing");
	 
 }

 
 public String toString() {
  return "stopped playing video";
 }
}

