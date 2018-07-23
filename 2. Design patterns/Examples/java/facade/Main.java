package facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeTheatherFacade homeTheather = 
				new HomeTheatherFacade(
						amp, tuner, 
						dvd, cd, projector, screen, popper);
		
		homeTheather.watchMovie();
		homeTheather.endMovie();
	}

}
