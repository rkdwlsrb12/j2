package com.j2.state.videoplayer;

public class BetteryOut implements State{
	VideoPlayer videoPlayer;
	 
    public BetteryOut(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
 
   
    public void videoPlay() {
    	System.out.println("You can't play a video because your video player is out of bettery");
    }
 
    public void videoStop() {
    	System.out.println("You haven't played a video");
		
	}
 
    public void wake() {
    	System.out.println("You can't turn on your video player because it is out of bettery");
    }
 
    public void sleepOn() {
    	System.out.println("Your video player is already off because it is out of bettery");
    }
 
    
    public void running(){
    	System.out.println("Your video player is not playing");
    	 
     }

 
    public String toString() {
    	return "out of bettery!";
    }


}
