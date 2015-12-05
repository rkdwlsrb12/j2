package com.j2.state.videoplayer;


public class VideoPlayer {
	 	State onState;
	    State playState;
	    State stopState;
	    State sleepState;
	    State betteryOutState;
	 
	    State state = betteryOutState;
	    int betteryBar = 0;
	 
	    public VideoPlayer(int numberOfBetteryBar) {
	    	onState = new On(this);
	    	playState = new Play(this);
	    	stopState = new Stop(this);
	    	sleepState = new Sleep(this);
	    	betteryOutState = new BetteryOut(this);
	        this.betteryBar = numberOfBetteryBar;
	        if (numberOfBetteryBar > 0) {
	            state = onState;
	        } 
	    }
	 
	    public void videoPlay(){
	    	state.videoPlay();
	    	state.running();
	    }
		public void videoStop(){
			state.videoStop();
		}
		public void wake(){
			state.wake();
		}
		
		public void sleepOn(){
			state.sleepOn();
		}
		
		
	   
	    void setState(State state) {
	        this.state = state;
	    }

	    void playVideoPlayer() {
	        System.out.println("A video player is now playing...");
	        if (betteryBar != 0) {
	        	betteryBar = betteryBar - 1;
	        }
	    }
	 
	    int getBetteryBar() {
	        return betteryBar;
	    }
	 
	    void charge(int betteryBar) {
	        this.betteryBar = betteryBar;
	        state = onState;
	        System.out.println("A video player is now charging to "+betteryBar+" bar");
	    }

	    public State getState() {
	        return state;
	    }

	    public State getOnState() {
	        return onState;
	    }

	    public State getStopState() {
	        return stopState;
	    }

	    public State getPlayState() {
	        return playState;
	    }

	    public State getSleepState() {
	        return sleepState;
	    }
	    
	    public State getBetteryOutState() {
	        return betteryOutState;
	    }
	    
	    public String toString() {
	        StringBuffer result = new StringBuffer();
	        result.append("\nSangMyung Video Player");
	        result.append("\nBettery: " + betteryBar + " bar");
	        if (betteryBar != 1) {
	            result.append("s");
	        }
	        result.append("\n");
	        result.append("Video Player is " + state + "\n");
	        return result.toString();
	    }
	}