package com.j2.state.videoplayer;

public class Play implements State{
	VideoPlayer videoPlayer;
	 
    public Play(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
 
   
 public void videoPlay() {
  System.out.println("You already played a video");
 
 }
 
 public void videoStop() {
	
	 System.out.println("You stopped playing a video");
	 videoPlayer.setState(videoPlayer.getStopState());
	 
	}
 
 public void wake() {
  System.out.println("Your screen is already on");
 }
 
 public void sleepOn() {
  System.out.println("Your video player can't be on sleep mode while it is playing");
  }
 
 public void running(){
	 videoPlayer.playVideoPlayer();
	  if (videoPlayer.getBetteryBar() > 0) {
		  videoPlayer.setState(videoPlayer.getPlayState());
	  } else {
	   System.out.println("Oops, out of bettery!");
	   videoPlayer.setState(videoPlayer.getBetteryOutState());
	  }
		 
	 }

 
 public String toString() {
  return "playing video";
 }
}
