package com.j2.state.videoplayer;

public interface State {
	public void videoPlay();
	public void videoStop();
	public void wake();
	public void sleepOn();
	public void running();
}
