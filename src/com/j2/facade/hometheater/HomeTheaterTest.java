package com.j2.facade.hometheater;

public class HomeTheaterTest {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Jin's Amplifier");
		Tuner tuner = new Tuner("Jin's AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Jin's DVD Player", amp);
		CdPlayer cd = new CdPlayer("Jin's CD Player", amp);
		Projector projector = new Projector("Jin's Projector", dvd);
		Light light = new Light("Living Room Lights");
		Screen screen = new Screen("Theater Screen");
		Computer computer=new Computer("Living Room Computer");
		Cellphone cellphone=new Cellphone("Jin's Vega Iron2");		
		
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd, 
						projector, screen, light, cellphone,computer);
 
		homeTheater.watchMovie("The Lord of the Lings");
		homeTheater.endMovie();
		homeTheater.beginStudy();
		homeTheater.endStudy();
	}
}
