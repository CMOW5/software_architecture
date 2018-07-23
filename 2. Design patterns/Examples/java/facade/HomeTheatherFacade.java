package facade;

public class HomeTheatherFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	Screen screen;
	PopCornPopper popper;
	
	public HomeTheatherFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, 
			CdPlayer cd, Projector projector,
			Screen screen, PopCornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void WatchMovie() {
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		popper.off();
		// .....
	}
	
	
}
