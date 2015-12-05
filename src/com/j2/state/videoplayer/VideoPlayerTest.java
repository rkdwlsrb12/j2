package com.j2.state.videoplayer;



public class VideoPlayerTest {

	public static void main(String[] args) {
	    VideoPlayer videoPlayer = new VideoPlayer(4);

        System.out.println(videoPlayer);

        videoPlayer.videoPlay();
        videoPlayer.videoStop();
        videoPlayer.sleepOn(); //����� ������ ȭ�� sleep
        videoPlayer.videoStop(); //ȭ���� ���������� �ڵ����� �������

        System.out.println(videoPlayer);
        
        videoPlayer.wake();
        videoPlayer.videoPlay();
        videoPlayer.sleepOn(); //����Ҷ��� ȭ�� sleep �ȵ�
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