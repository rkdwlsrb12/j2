package com.j2.state.videoplayer;



public class VideoPlayerTest {

	public static void main(String[] args) {
	    VideoPlayer videoPlayer = new VideoPlayer(4);

        System.out.println(videoPlayer);

        videoPlayer.videoPlay();
        videoPlayer.videoStop();
        videoPlayer.sleepOn(); //재생이 끝나면 화면 sleep
        videoPlayer.videoStop(); //화면이 꺼저있으면 자동으로 재생중지

        System.out.println(videoPlayer);
        
        videoPlayer.wake();
        videoPlayer.videoPlay();
        videoPlayer.sleepOn(); //재생할때는 화면 sleep 안됨
        videoPlayer.videoStop();
        videoPlayer.sleepOn();
        
        System.out.println(videoPlayer);
        
        videoPlayer.wake();
        videoPlayer.videoPlay();
        videoPlayer.videoStop();
        videoPlayer.charge(4);
        
        System.out.println(videoPlayer);
        
  
        
    }
}